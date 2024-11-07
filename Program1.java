import java.util.*;  
class Program1{
    public static void main(String args[]){
    int i,j;
    //System.out.println("Hollow Reactangle Program"); 
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the number of rows: ");  
    int rows= sc.nextInt();  
    int columns= sc.nextInt();
    //Scanner sc1= new Scanner(System.in);
   // System.out.print("enter the number of columns: ");  
  //  int columns= sc.nextInt(); 
    for(i=1; i<=rows; i++)
    {
        for(j=1; j<=columns; j++)
        {
            if(i==1 || i==rows || j==1 || j==columns)
            {
		        System.out.print("*");
            }
            else
            {
		    System.out.print(" ");
            }
        }
        System.out.println("");
	    }
    }
} 