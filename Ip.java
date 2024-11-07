import java.io.*;
import java.net.*;
import java.util.*;
public class Ip
{
	public static void main(String[] args) {
		String Hostname;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Hostname");
			Hostname =sc.next();
			InetAddress ip = InetAddress.getByName(Hostname);
			System.out.println("Hostname :"+ip.getHostName());
			System.out.println("Ip Address :"+ip.getHostAddress());
		}
	catch(IOException e)
	{
		System.out.print(e);
	}
}
}