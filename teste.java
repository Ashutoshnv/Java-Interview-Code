class overridetest
{
int x,y;
overridetest(int a,int b)
{
x=a;
y=b;
}
void display()
{
System.out.println("x="+x);
System.out.println("y="+y);
}
}
class teste extends overridetest
{
int z;
teste(int a,int b,int c)
{
super(a,b);
z=c;
}
void display() //
{
super.display(); //call to super class display()
System.out.println("z="+z);
}
public static void main(String args[])
{
teste t= new teste(4,5,6);
t.display();
}
} 