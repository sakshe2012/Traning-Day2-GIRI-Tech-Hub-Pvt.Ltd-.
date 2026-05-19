import java.util.*;
class Java9
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int A;
int B;
int C;
System.out.println("enter A");
A=sc.nextInt();
System.out.println("enter B");
B=sc.nextInt();
System.out.println("enter C");
C=sc.nextInt();
if(A>B && A>C)
{
System.out.println(A + " is largest");

}
else if( B>A && B>C)
{
System.out.println(B+ " is largest");

}
else
{
System.out.println(C +" is largest");
}

}



}