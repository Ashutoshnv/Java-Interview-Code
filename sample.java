class sample
{
	public static void main(String[] args) {
		boolean f=true;

		first:
		{
			second:
			{
				third:
				{
					System.out.println("Before Break;");
					if(f)
						break third;
					System.out.println("hi");
				}
				System.out.println("hello");
			}
			System.out.println("bye");
		}
	}
}