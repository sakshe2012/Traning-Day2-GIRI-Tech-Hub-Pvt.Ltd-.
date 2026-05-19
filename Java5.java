
/*Q5. Write a java program to check whether number is palindrome or not.
*/

import java.util.*;
class Java5
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
int a;

int rev=0;

System.out.println("enter number");
a=sc.nextInt();
int temp = a;
while(a>0)
{
    rev=rev*10 + a% 10;
    a = a/10;

}

if(temp == rev)
{
 System.out.println("number is palindrom");
}
else
{
System.out.println("number is  not palindrom");
}
}
}
