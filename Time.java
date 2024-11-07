import java.util.Scanner;
class invalidAgeException extends Exception
{
//defaul constructor
}
class Time
{
	void status(int age)throws InvalidAgeException
	{
		if (age>=18)
	{
		System.out.println("Eligible for voting");
	}
	else 
	{
		throw new InvalidAgeException();
	}
	}
	public static void main(String[] args)throws InvalidAgeException 
	{
		Time t = new Time();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age =s.nextInt();
		t.status(age);
	}
}