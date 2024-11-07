class fibonacci
{
public static void main(String[] args) 
{
	int a,b,c,t;
	 a=1;
	 b=2;
	 c=1;
	System.out.print("1 1 2");
	do
	{
		t=a+b;
		System.out.print(" "+t);
		a=b;
		b=t;
		c=c+1;
	}while (c<9); 
		
	}
}
