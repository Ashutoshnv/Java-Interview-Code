import java.util.Scanner;
import java.util.*;

class Q
/*{
	public static void main(String[] args) 
	{
		int a=0;
		while (a<100)
		{
			System.out.println(a);
			a=a+2;
		}//while (a<100); 
		
	}
}
{
	public static void main(String[] args) 
	{
		String s;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Name : ");
		s=sc.nextLine();
		System.out.println("The Value is this = "+s);

	}
}*/
{
	public void disp()
	{
		System.out.println("java");
	}
	class p extends Q
	{
		public void disp()
		{
			System.out.println("nptel");
		}
		class c extends p
		{
			public void disp()
			{
				super.super.disp();
				System.out.println("Course");
			}
		}
		class While
		{
			public static void main(String[] args) 
			{
				C c=new c;
				c.disp();

			}

			}
		}
	}
	
