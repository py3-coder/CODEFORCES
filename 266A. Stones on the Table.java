/*
A. Stones on the Table
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.

Input
The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.

Output
Print a single integer — the answer to the problem.

Examples
inputCopy
3
RRG
outputCopy
1
inputCopy
5
RRRRR
outputCopy
4
inputCopy
4
BRBG
outputCopy
0

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String n = sc.nextLine();
	    int m = Integer.valueOf(n);
	    String color =sc.nextLine();
	    int count=0;
	    for(int i=0;i<m-1;i++){
	        if(color.charAt(i)==color.charAt(i+1)){
	            count++;
	        }
	    }
		System.out.println(count);
	}
}