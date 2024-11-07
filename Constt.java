
// Demonstrate use of at least two types of constructors
class Constt 
{
	Constt()
	{
		System.out.println("This is Zero argument construcor");
	}
	Constt(int i)
	{
		System.out.println(i);
	}
	Constt(int i,String str)
	{
		System.out.println(i);
		System.out.println(str);
	}
	public static void main(String[] args) {
		Constt c1=new Constt();
		Constt c2=new Constt(10);
		Constt c3=new ssConstt(111,"Asutosh");
	}

}
	
