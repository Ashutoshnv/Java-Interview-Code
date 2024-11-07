import java.util.*;
class Vect
{
	public static void main(String[] args) {
		Vector v = new Vector(5);
		System.out.println("The size of vector is"+v.size());
		System.out.println("the capacity of vector is"+v.capacity());
		v.add(2);
		v.add(3);
		v.add(0,1);
		v.add("Ashutosh");
		v.add("yadav");
		v.add(5);
		System.out.println("Vector is "+v);
		System.out.println("the size of vector is"+v.size());
		System.out.println("the capacity of vector is:"+v.capacity());

	}
}