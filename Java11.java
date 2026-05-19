import java.util.*;
class Java11
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int A;
System.out.println("enter marks");
A=sc.nextInt();
if(A>=90)
{
System.out.println("got GRADE A");

}
else if(A<=89 && A>=80)
{
System.out.println("got GRADE B");

}
else if(A<=79 && A>=70)
{
System.out.println("got GRADE C");

}
else
{
System.out.println("got GRADE F");
}

}
}