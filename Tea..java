import java.util.Scanner;
class invalidAgeException extends Exception
{

}
class Time
{
	void status(int age)throws invalidAgeException
	{
		if (age >=18)
	{
		System.out.println("Eligible for voting");
	}
	else 
	{
		throws new invalidAgeException();
	}
	}
	public static void main(String[] args) {
		Time t = new Tea();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age =s.nextInt();
		e.status(age);
	}
}