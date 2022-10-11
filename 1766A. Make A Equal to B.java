/*
A. Make A Equal to B
time limit per test1 second
memory limit per test256 megabytes
inputs
outputs
You are given two arrays a and b of n elements, each element is either 0 or 1.

You can make operations of 2 kinds.

Pick an index i and change ai to 1−ai.
Rearrange the array a however you want.
Find the minimum number of operations required to make a equal to b.

Input
Each test contains multiple test cases. The first line contains a single integer t (1≤t≤400) — the number of test cases. Description of the test cases follows.

The first line of each test case contains a single integer n (1≤n≤100) — the length of the arrays a and b.

The second line of each test case contains n space-separated integers a1,a2,…,an (ai is 0 or 1), representing the array a.

The third line of each test case contains n space-separated integers b1,b2,…,bn (bi is 0 or 1), representing the array b.

Output
For each test case, print the minimum number of operations required to make a equal to b.

Example
inputCopy
5
3
1 0 1
0 0 1
4
1 1 0 0
0 1 1 1
2
1 1
1 1
4
1 0 0 1
0 1 1 0
1
0
1
outputCopy
1
2
0
1
1
Note
In the first case, we need only one operation: change a1 to 1−ai. Now a=[0,0] which is equal to b.

In the second case, the optimal way is to rearrange a to get the array [0,1,11. Now a=[0,0,1] which is equal to b.

In the second case, one of optimal ways would be to first change a3 to 1−a3, then rearrange a.

In the third case, no operation is needed.

In the fourth case, the optimal way is to rearrange a to get the array [0,1,1,0].
*/
/**
 * Solution
 */
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t_c = sc.nextInt();
            List<Integer> res = new ArrayList<>();
            while(t_c-->0){
                int len = sc.nextInt();
                int arr1[] = new int[len];
                int arr2[] = new int[len];
                int o1=0;
                int o2=0;
                int diff =0;
                for(int i=0;i<len;i++){
                    arr1[i] = sc.nextInt();
                    if(arr1[i]==1) o1+=1;
                }
                for(int i=0;i<len;i++){
                    arr2[i] = sc.nextInt();
                    if(arr2[i]==1) o2+=1;
                    if(arr2[i]!=arr1[i]) diff++;
                }
                if(o1==o2){
                    if(diff==0) res.add(0);
                    else res.add(1);
                }else{
                    int num = Math.abs(o2-o1);
                    //System.out.println(diff +" "+num);
                    if(diff>num){
                        res.add(num+1);
                    }else{
                        res.add(num);
                    }
                }
            }
            for(int ele : res)
            System.out.println(ele);
        }
    }
}
