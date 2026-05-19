/*
Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.
*/
import java.util.*;
class Java7
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int sp;
int cp;
System.out.println("enter SP");
sp=sc.nextInt();
System.out.println("enter CP");
cp=sc.nextInt();
if(sp>=cp)
{
System.out.println("profit");

}
else
{
System.out.println("loss");

}

}



}
