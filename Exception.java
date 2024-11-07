class Exception
{
	public static void main(String[] args)
	{
		int a=0,b=0,res;
		try
	{
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		res=a/b;
		System.out.println("Division is"+res);
	}
	    catch(Exception e)
	    {
	    	System.out.println("Cannot divde by zero");
	    }
	    res=a+b;
		System.out.println("Addition is "+res);
	}
}