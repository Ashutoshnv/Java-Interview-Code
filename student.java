class Student
{
	int marks;
	double perc;
	student(int m,double p)
	{
		marks=m;
		perc=p;
	}
	void display()
	{
		System.out.println("Marks="+marks);
		System.out.println("Percetage="+perc);
	}
	public static void main(String[] args) {
		
	Student s1=new Student(121,60.5);
	s1.display();
	
	}
}