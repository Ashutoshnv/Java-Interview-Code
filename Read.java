import java.io.DataInputStream;
class Read
{
	public static void main(String[] args) {
		DataInputStream in = new DataInputStream(System.in);
		int intNumber = 0;
		float floatNumber = 0.0f;
		try
		{
			System.out.println("Enter the ineger number:");
			intNumber=Integer.parseInt(in.readLine());
			System.out.println("Enter a float nu");
			floatNumber=Float . valueof ( in.readLine() ) .floatvalue();
		}
			catch (Exception e) {}
			System.out.println("intnumber=" + intNumber);
			System.out.println("floatNumber=" + floatNumber);	
			
		
	}
}