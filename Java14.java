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