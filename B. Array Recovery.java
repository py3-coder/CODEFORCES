/*
B. Array Recovery

For an array of non-negative integers a of size n, we construct another array d as follows: d1=a1, di=|ai−ai−1| for 2≤i≤n.

Your task is to restore the array a from a given array d, or to report that there are multiple possible arrays.

Input
The first line contains a single integer t (1≤t≤100) — the number of test cases.

The first line of each test case contains one integer n (1≤n≤100) — the size of the arrays a and d.

The second line contains n integers d1,d2,…,dn (0≤di≤100) — the elements of the array d.

It can be shown that there always exists at least one suitable array a under these constraints.

Output
For each test case, print the elements of the array a, if there is only one possible array a. Otherwise, print −1.

Example
input :
3
4
1 0 2 5
3
2 6 3
5
0 0 0 0 0
output :
1 1 3 8
-1
0 0 0 0 0
Note
In the second example, there are two suitable arrays: [2,8,5] and [2,8,11].
*/
// CODE:
import java.util.*;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test_case = sc.nextInt();
	    List<List<Integer>> result = new ArrayList<>(); 
	    while(test_case>0){
	        int len  = sc.nextInt();
	        int d[] = new int[len];
	        for(int i=0;i<len;i++){
	            d[i] = sc.nextInt();
	        }
	        boolean flag = true;
	        List<Integer> res = new ArrayList<>();
	        res.add(d[0]);
	        for(int i=1;i<len;i++){
	            int ele1 = d[i]+res.get(res.size()-1);
	            int ele2 =res.get(res.size()-1)-d[i];
	            if(ele2>0 && ele2!=ele1){
	                flag = false;
	                result.add(new ArrayList<>(Arrays.asList(-1)));
	                //System.out.println(-1);
	                break;
	            }
	            res.add(ele1);
	        }
	        if(flag==true){
	            result.add(new ArrayList<>(res));
	            //System.out.println(res);
	        }
	        test_case--;
	    }
	    for(List<Integer> sub:result){
	        int size=sub.size();
	        for(int i=0;i<size;i++){
	            System.out.print(sub.get(i)+" ");
	        }
	        System.out.println();
	    }
	}
}
