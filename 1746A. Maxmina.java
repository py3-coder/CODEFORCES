/*
A. Maxmina
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
You have an array a of size n consisting only of zeroes and ones and an integer k. In one operation you can do one of the following:

Select 2 consecutive elements of a and replace them with their minimum (that is, let a:=[a1,a2,…,ai−1,min(ai,ai+1),ai+2,…,an] for some 1≤i≤n−1). This operation decreases the size of a by 1.
Select k consecutive elements of a and replace them with their maximum (that is, let a:=[a1,a2,…,ai−1,max(ai,ai+1,…,ai+k−1),ai+k,…,an] for some 1≤i≤n−k+1). This operation decreases the size of a by k−1.
Determine if it's possible to turn a into [1] after several (possibly zero) operations.

Input
Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤1000). The description of the test cases follows.

The first line of each test case contains two integers n and k (2≤k≤n≤50), the size of array a and the length of segments that you can perform second type operation on.

The second line contains n integers a1,a2,…,an (ai is 0 or 1), elements of array a.

Output
For each test case, if it is possible to turn a into [1], print "YES", otherwise print "NO".

Example
inputCopy
7
3 2
0 1 0
5 3
1 0 1 1 0
2 2
1 1
4 4
0 0 0 0
6 3
0 0 1 0 0 1
7 5
1 1 1 1 1 1 1
5 3
0 0 1 0 0
outputCopy
YES
YES
YES
NO
YES
YES
YES
Note
In the first test case, you can perform the second type operation on second and third elements so a becomes [0,1], then you can perform the second type operation on first and second elements, so a turns to [1].

In the fourth test case, it's obvious to see that you can't make any 1, no matter what you do.

In the fifth test case, you can first perform a type 2 operation on the first three elements so that a becomes [1,0,0,1], then perform a type 2 operation on the elements in positions two through four, so that a becomes [1,1], and finally perform the first type operation on the remaining elements, so that a becomes [1].
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Maxmina {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> res =new ArrayList<>();
            int t_c = sc.nextInt();
            while(t_c-->0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int ele[] = new int[n];
                boolean flag = false;
                for(int i=0;i<n;i++){
                    ele[i] = sc.nextInt();
                    if(ele[i]==1){
                        flag = true;
                    }
                }
                if(flag==true){
                    res.add("YES");
                }else{
                    res.add("NO");
                }
            }
            for(String ele : res){
                System.out.println(ele);
            }
        }
    }
}
