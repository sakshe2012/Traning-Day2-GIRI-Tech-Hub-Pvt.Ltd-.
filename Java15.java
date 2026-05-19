/*
Q.15Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.
*/
import java.util.*;
class Java15
{
public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
int A;
int B;
int C;
System.out.println("enter 1st number");
A=sc.nextInt();
System.out.println("enter 2st number");
B=sc.nextInt();
System.out.println("enter choice");
C=sc.nextInt();
switch(C)
{
case 1: 
        System.out.println("sum is :" + (A+B));
        break;
case 2:
       System.out.println("differeence is :" + (A-B));
        break;
case 3: 
         System.out.println("mul is :" + (A*B));
        break;
case 4:
        System.out.println(" is :" + (A*B));
        break;
default: 
       System.out.println("invalid");
        break;
}
}


}
