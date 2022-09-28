/*
B. Before an Exam
time limit per test0.5 second
memory limit per test64 megabytes
inputstandard input
outputstandard output
Tomorrow Peter has a Biology exam. He does not like this subject much, but d days ago he learnt that he would have to take this exam. Peter's strict parents made him prepare for the exam immediately, for this purpose he has to study not less than minTimei and not more than maxTimei hours per each i-th day. Moreover, they warned Peter that a day before the exam they would check how he has followed their instructions.

So, today is the day when Peter's parents ask him to show the timetable of his preparatory studies. But the boy has counted only the sum of hours sumTime spent him on preparation, and now he wants to know if he can show his parents a timetable sсhedule with d numbers, where each number sсhedulei stands for the time in hours spent by Peter each i-th day on biology studies, and satisfying the limitations imposed by his parents, and at the same time the sum total of all schedulei should equal to sumTime.

Input
The first input line contains two integer numbers d, sumTime (1 ≤ d ≤ 30, 0 ≤ sumTime ≤ 240) — the amount of days, during which Peter studied, and the total amount of hours, spent on preparation. Each of the following d lines contains two integer numbers minTimei, maxTimei (0 ≤ minTimei ≤ maxTimei ≤ 8), separated by a space — minimum and maximum amount of hours that Peter could spent in the i-th day.

Output
In the first line print YES, and in the second line print d numbers (separated by a space), each of the numbers — amount of hours, spent by Peter on preparation in the corresponding day, if he followed his parents' instructions; or print NO in the unique line. If there are many solutions, print any of them.

Examples
inputCopy
1 48
5 7
outputCopy
NO
inputCopy
2 5
0 1
3 5
outputCopy
YES
1 4 
*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int sumTime = sc.nextInt();
        int min[] = new int[days];
        int max[] = new int[days];
        int maxTime =0;
        int minTime =0;
        for(int i=0;i<days;i++){
            min[i] = sc.nextInt();
            minTime +=min[i];
            max[i] = sc.nextInt();
            maxTime +=max[i];
        }
        if(sumTime >maxTime || sumTime<minTime){
            System.out.print("NO");
        }else{
            System.out.println("YES");
            sumTime -=minTime;
            for(int i=0;i<days;i++){
                if(max[i]-min[i]<sumTime){
                    System.out.print(max[i]+" ");
                    sumTime -=max[i]-min[i];
                }else{
                    System.out.print((min[i]+sumTime)+" ");
                    sumTime =0;
                }
            }
        }
    }
}
