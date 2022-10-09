/*
A. Nearly Lucky Number
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Petya loves lucky numbers. We all know that lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Unfortunately, not all numbers are lucky. Petya calls a number nearly lucky if the number of lucky digits in it is a lucky number. He wonders whether number n is a nearly lucky number.

Input
The only line contains an integer n (1 ≤ n ≤ 1018).

Please do not use the %lld specificator to read or write 64-bit numbers in С++. It is preferred to use the cin, cout streams or the %I64d specificator.

Output
Print on the single line "YES" if n is a nearly lucky number. Otherwise, print "NO" (without the quotes).

Examples
input:
40047

output:
NO

input:
7747774

output:
YES

input:
1000000000000000000

output:
NO

Note
In the first sample there are 3 lucky digits (first one and last two), so the answer is "NO".
In the second sample there are 7 lucky digits, 7 is lucky number, so the answer is "YES".
In the third sample there are no lucky digits, so the answer is "NO".
*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long num = sc.nextLong();
	    int k=0;
	    while(num>0){
	        if((num%10==4) || (num%10==7)){
	            k++;
	        }
	        num/=10;
	    }
		boolean lucky = (k > 0);
		while (k > 0) {
			if ((k % 10 != 4) && (k % 10 != 7)) {
				lucky = false;
			}
			k /= 10;
		}
		System.out.println(lucky ? "YES" : "NO");
	}
}

