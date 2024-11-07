class Constoverloding
{
int age;
int roll;
String name;
Constoverloding()
{
System.out.println("Default Constructor");
age=18;
roll=44;
name = "ashutosh";
}
Constoverloding(int a,int r,String n)
{
System.out.println("Parameterized Constructor");
age=a;
roll = r;
name=n;
}
void display()
{
System.out.println("name is:"+name);
System.out.println("age is:"+age);
System.out.println("roll number:"+roll);
}
public static void main(String []args)
{
Constoverloding s=new Constoverloding(int age,int roll);
Constoverloding s1=new Constoverloding(47,2,"ashutosh");
s1.display();
}
}
