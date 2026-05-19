/*
Q.14Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
*/
import java.util.*;
class Java14
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
double A;
System.out.println("enter sales amount");
A=sc.nextInt();
if(A<5000)
{
System.out.println("got commison :" +(A*2)/100);

}
else if(A<=10000 && A>=5000)
{
System.out.println("got commiison :"+(A*5)/100);

}

else
{
System.out.println("got commission: "+(A*10)/100);
}

}
}
