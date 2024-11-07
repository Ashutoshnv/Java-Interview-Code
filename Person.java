class Person
{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	void getPerson()
	{
		System.out.print("Enter Name of Employee");
		name = sc.next();
		System.out.print("Enter age of employee");
		age =sc.nextInt();
	}
}
class employee extends Person
{
	String emp_designation;
	int emp_sal;
	void getEmployee()
	{
		System.out.print("Enter desigination of employee:");
		emp_designation =sc.next();
		System.out.print("Enter sal of employee:");
		emp_sal =sc.nextInt();
	}
	void display()
	{
		System.out.println("Name:"+name+"\tAge:"+age);
		System.out.println("Designation:"+emp_designation+"\tSalary:"+emp_sal);

	}
}
class testk1
{public static void main(String[] args) {
	employee e=new employee();
	e.getPerson();
	e.getEmployee();
	e.display();
}
}
	


	
