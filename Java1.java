import java.util.*;
class Java1
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
int a;

int rev=0;

System.out.println("enter number");
a=sc.nextInt();

while(a>0)
{
    rev=rev*10 + a% 10;
    a = a/10;

}

System.out.println("reverse is :" + rev);
}
}