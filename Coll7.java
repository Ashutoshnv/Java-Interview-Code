import java.util.*;
class Coll7
{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Vector v = new Vector(5);
	System.out.println("currebt size"+v.size());
	v.addElement(new Integer(10));
	v.addElement(new Integer(20));
	v.addElement(new Float(4.5));
	v.addElement(new Float(80.90));
	v.addElement("ABC");
	v.addElement("XYZ");

	System.out.println("current size"+v.size());
	System.out.println("First:"+v.firstElement());
	System.out.println("Last:"+v.lastElement());
	System.out.println("All element :"+v);

	System.out.print("Enter Element to remove :");
	Float ele = sc.nextFloat();
	v.removeElement(ele);
	System.out.println("After removal:"+v);
}
}
		
	

	
