/*
A. Domino piling

You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares.
You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:
1. Each domino completely covers two squares.
2. No two dominoes overlap.
3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

Find the maximum number of dominoes, which can be placed under these restrictions.

Input
In a single line you are given two integers M and N — board sizes in squares (1 ≤ M ≤ N ≤ 16).

Output
Output one number — the maximal number of dominoes, which can be placed.

Examples
input
2 4
output
4

input
3 3
output
4
*/

import java.util.Scanner;
public class Domino_piling {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x =sc.nextInt();
            int y =sc.nextInt();
            x=x*y;
            if(x%2!=0){
                System.out.println((x-1)/2);
            }else{
                System.out.println(x/2);
            }
        }
    }
}
