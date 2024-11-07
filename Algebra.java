
import java.util.*;
class Maths 
{
   static int add(int a, int b)
    {
        int total=a+b;
        return total;
        //System.out.println(total);
    }
   //System.out.println(total);
}
public class Algebra 
{
    public static void main(String[] args) 
    {
         Maths m1=new Maths();
         int total=m1.add(10,20);
         System.out.println(total);
    }
}
