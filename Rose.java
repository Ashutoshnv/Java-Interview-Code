class Rose
{
	Ros(String name)
	{
		System.out.println("The Rose colour is :" + name);
	}
	public static void main(String[] args) {
		Rose r=new Rose("White");
		r= new Rose("Red");
	}
}