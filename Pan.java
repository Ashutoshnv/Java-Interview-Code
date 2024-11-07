class EvenThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i+=2)
			{
				System.out.println("Even number is"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{}
	}
}
class OddThread implements Runnable
{
	public void run()
	{
		try
		{
			for (int i=1;i<=10;i+=2) 
			{
				System.out.println("Odd number is"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{}
	}
}
class Pan
{
	public static void main(String[] args) 
	{
		EvenThread t1=new EvenThread();
		t1.start();
		OddThread  t2=new OddThread();
		Thread t3=new Thread(t2);
		t3.start();
	}
}