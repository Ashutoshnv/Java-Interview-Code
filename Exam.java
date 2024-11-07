abstract class Bank
{
	abstract void news();
}
class Account extends Bank
{
	Void news();
	System.out.println("that is the good news");
}
class Exam extends Bank
{
	public static void main(String[] args) {
		Account a= new Account();
		a.news();
	}
}