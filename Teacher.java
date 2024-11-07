package college;
import java.util.*;

class Teacher
{
String name,degree;
Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("Enter name of teacher:");
name=sc.next();
System.out.println("Enter degree of teacher:");
degree=sc.next();
}
void display()
{
System.out.println("Name:"+name+"\t Degree:"+degree);
}
}