class Disp
{
	public static void main(String[] args) {
		System.out.println("screen Display");
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				System.out.print(i);
			}
			System.out.println("\n");
		}
		System.out.println("screen display done");
	}
}