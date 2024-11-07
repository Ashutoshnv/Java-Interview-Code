/* 
public class First 
{
    public static void main(String[] args) 
    {
        int a=60;
        int b=50;
        double c;
        c=Math.sqrt(a);
        System.out.println("The Total number of output is: "+c);
    }
    
}

class Java
{
    int length;
    int breath;
    
     void getdata(length , breath);

}
class AbstractFirst extends Java 
{
    public static void main(String[] args) 
    {
        float area;
        Java j1= new AbstractFirst();
        j1.getdata(14,10);
        area = j1.length + j1.breath;
        System.out.println("Area ="+area);
    }
        
    

}
*/
public class AbstractFirst
{
    public static void main(String[] args) 
    {
        int n = 4;
        int m = 5;
        
        // outer loop
        for(int i=1; i<=n; i++)
        {
            // inner loop
            for(int j=1; j<=m; j++)
            {
                // Condtional Statement 
               if(i==1 || j==1 || i==n || j==m)
               {
                 System.out.print("*");
               }
               else
               {
                System.out.print(" ");
               }
              // System.out.println();
            }
            System.out.println();
        } 
    }
}
