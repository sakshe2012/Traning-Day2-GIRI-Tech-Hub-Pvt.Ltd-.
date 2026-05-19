/*Q16. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation:
 Use a char or string in switch to match grades and print remarks.
*/

import java.util.*;
class Java16
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
char A;
System.out.println("enter garde");
A=sc.next().charAt(0);

switch(A)
{
case 'A': System.out.println("EXCELLENT");
          break;
case 'B': System.out.println("GOOD");
          break;
case 'C': System.out.println("AVERAGE");
          break;
case 'D': System.out.println("POOR");
          break;
case 'F': System.out.println("FAIL");
          break;
default: System.out.println("invalid input");

          break;


}
}
}
