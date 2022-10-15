/*
B. Rebellion
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
You have an array a of size n consisting only of zeroes and ones. You can do the following operation:

choose two indices 1≤i,j≤n, i≠j,
add ai to aj,
remove ai from a.
Note that elements of a can become bigger than 1 after performing some operations. Also note that n becomes 1 less after the operation.

What is the minimum number of operations needed to make a non-decreasing, i. e. that each element is not less than the previous element?

Input
Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤104). The description of the test cases follows.

The first line of each test case contains an integer n (1≤n≤105), the size of array a.

Next line contains n integers a1,a2,…an (ai is 0 or 1), elements of array a.

It's guaranteed that sum of n over all test cases doesn't exceed 2⋅105.

Output
For each test case print a single integer, minimum number of operations needed to make a non-decreasing.

Example
inputCopy
4
8
0 0 1 1 1 1 1 1
5
1 0 0 1 1
2
1 0
11
1 1 0 0 1 0 0 1 1 1 0
outputCopy
0
1
1
3
Note
In the first test case, a is already non-decreasing, so you don't need to do any operations and the answer is 0.

In the second test case, you can perform an operation for i=1 and j=5, so a will be equal to [0,0,1,2] and it becomes non-decreasing.

In the third test case, you can perform an operation for i=2 and j=1, so a will be equal to [1] and it becomes non-decreasing.
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Rebellion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> res =new ArrayList<>();
            int t_c = sc.nextInt();
            while(t_c-->0){
                int n = sc.nextInt();
                int ele[] = new int[n];
                int count1=0;
                int count0=0;
                List<Integer> pos1 = new ArrayList<>();
                List<Integer> pos0 = new ArrayList<>();
                for(int i=0;i<n;i++){
                    ele[i] = sc.nextInt();
                    if(ele[i]==1){
                        count1++;
                        pos1.add(i);
                    }
                    if(ele[i]==0){
                        count0++;
                        pos0.add(i);
                    }
                }
                if(count1==n || count0==n){
                    res.add(0);
                }else{
                    int moves =0;
                    int m=pos0.size()-1;
                    for(int i=0;i<pos1.size();i++){
                        if(pos1.get(i)<pos0.get(m)){
                            moves++;
                            if(m==0){
                                break;
                            }
                            m--;
                        }
                        else break;

                    }
                    res.add(moves);
                }
            }
            for(int j : res){
                System.out.println(j);
            }
        }
    }
}
