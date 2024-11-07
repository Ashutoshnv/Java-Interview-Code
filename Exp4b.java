class abc
{
abc()
{
System.out.println("Constructor method........");
}
protected void finalize()
{
System.out.print("Garbage Collected.....");
}
}
class Exp4b
{
public static void main(String args[])
{
abc ob=new abc();
ob=null;
System.gc();
}
}