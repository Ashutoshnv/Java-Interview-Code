class A
{
	int a=10;
	int b=30;
	int c=0;
	/*void get()
	{

		System.out.println("yeh lo");
	}*/
}

class B extends A
{//int c=0;
	//void cal()
	
		c=a+b;
		System.out.println(c);
	}
	

class Counter
{
	public static void main(String[] args) 
	{
		B ab =new B();
		//ab.get();
		//ab.cal();
	}
}