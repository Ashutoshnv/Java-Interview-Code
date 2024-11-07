import java.util.*; 
import java.io.*; 
 
class Vec
{ 
	public static void main(String a[]) 
	{   
		Vector<Object> v = new Vector<Object>();   
		v.addElement(new Integer(5));   
		v.addElement(new Integer(10));   
		v.addElement(new String("String 1"));   
		v.addElement(new String("String 2"));   
		v.addElement(new Float(5.0));   
		v.addElement(new Float(6.7));   
		int n=0;   
		BufferedReader b = new BufferedReader(new  InputStreamReader(System.in)); 
		System.out.println("Following are the elements in the vector");  
		for(int i = 0; i <v.size();i++) 
			{  
				System.out.println("Element at "+i+ "is  "+v.elementAt(i));  
			} 
			System.out.println("Enter the position of the element to be removed");   
			try 
			{    
				n = Integer.parseInt(b.readLine());   
			} 
			catch(IOException e) 
			{    
				System.out.println("Exception caught!"+e);   
			}  
			System.out.println("The element at "+n +"is "+v.elementAt(n)+"  will be removed");   
			v.removeElementAt(n);   
			System.out.println("The following are the elements in the  vector");   
			for(int i = 0; i<v.size();i++) 
				{    
					System.out.println(v.elementAt(i));   
				} 
			} 
		} 