import java.util.Scanner;
abstract class test
{
abstract void get();
}
class test1 extends test
{
void get()
{
int a,b;
Scanner ob=new Scanner(System.in);
System.out.print("Enter 1st Number: ");
a=ob.nextInt();
System.out.println("Enter 2st Number: ");
b=ob.nextInt();
System.out.println("Addition is: "+(a+b));
}
}
class Exp4c
{
public static void main(String args[])
{
test1 obj=new test1();
obj.get();
}
}
