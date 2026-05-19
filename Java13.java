import java.util.*;

class Java13
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
int year_of_service;
double salary;
double bonus;
System.out.println("enter year of service");
year_of_service=sc.nextInt();
System.out.println("enter salary");
salary=sc.nextInt();
bonus=(salary*5)/100;
if(year_of_service>5)
{
System.out.println("got bonus of :" +bonus);

}

else
{
System.out.println("not applicable for bonus");

}



}

}