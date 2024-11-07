interface x 
    {
	public void myMethod();
	}
	interface y
	{
		public void myMethod();
	} 	
	class Exp19 implements x,y
	{
		public void myMethod()
	{
		System.out.println("Implements more thane one interfase");
	}
	public static void main(String[] args)
		
	{
		Exp19 obj=new Exp19();
		obj.myMethod(); 
			
		}
	}
	 
		
	

	
