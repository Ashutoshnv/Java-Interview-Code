class A
{
	int p;
	A ()
	{
		p =0;
	}
}
class Garb
{
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		a1=a2;
	}
}