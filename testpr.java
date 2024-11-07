class testpr 
{
	public static void main (String args[])
	{
		int i, sum;
		sum=0;
		for (i=101;i<200;i++)
		{
			if(i%7==0)
			{
				sum = sum + i;
			}
		}
		System.out.println("sum is"+sum);
	}
}
	
