import java.io.*;
class File1
{
public static void main(String[] args)
{
try
{
FileWriter file = new FileWriter("c:\\Data1.txt"); 
file.write("Hello");
}
catch(Exception e)
{}
finally
{
file.close();
}
}
}
