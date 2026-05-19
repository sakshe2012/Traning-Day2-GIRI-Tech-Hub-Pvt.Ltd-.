import java.util.*;
class Java2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
int firstdigit;
int lastdigit;
System.out.println("enter three digit number");
num=sc.nextInt();
firstdigit= num/100;
System.out.println("1st digit of number is" + firstdigit);
lastdigit= num%10;
System.out.println("2nd digit of number is" + lastdigit);


}


}