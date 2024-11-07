class Const 
{
	const()
	{
		System.out.println("This is Zero argument construcor");
	}
	const(int i)
	{
		System.out.println(i);
	}
	const(int i,String str)
	{
		System.out.println(i);
		System.out.println(str);
	}
	public static void main(String[] args) {
		const c1=new const();
		const c2=new const(10);
		const c3=new const(111,"Asutosh");
	}

}
	
