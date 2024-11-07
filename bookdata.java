import java.lang.*;
import java.io.*;
class Book
{
String bookname;
int bookid;
int price;
BufferedReader br=new BufferedReader(new InputStreamReader
(System.in));
void getdata()
{
try
{
System.out.println("Enter Book ID=");
bookid=Integer.parseInt(br.readLine());
System.out.println("Enter Book Name=");
bookname=br.readLine();
System.out.println("Enter Price=");
price=Integer.parseInt(br.readLine());
}
catch(IOException e)
{
System.out.println("Error");
}
}
void display()
{
System.out.println("Book ID="+bookid);
System.out.println("Book Name="+bookname);
System.out.println("Price="+price);
}
}
class bookdata
{
public static void main(String args[])
{
Book b[]=new Book[3];
for(int i=0;i<3;i++)
{
b[i]=new Book();
}
for(int i=0;i<3;i++)
{
b[i].getdata();
}
for(int i=0;i<3;i++)
{
b[i].display();
}
}
}
