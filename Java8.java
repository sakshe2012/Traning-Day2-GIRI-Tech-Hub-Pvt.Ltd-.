/*
Q.8 Write a java program to input any alphabet and check whether it is vowel or consonant.
*/
import java.util.*;
class Java8
{

public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
char ch;
System.out.println("enter a charcter");
ch=sc.next().charAt(0);
if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
{
    System.out.println("entered alph is vowel");
}
else
{
System.out.println("its consonnet");
}

}



}
