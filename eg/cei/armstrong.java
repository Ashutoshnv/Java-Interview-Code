package cei;
public class armstrong
{
 int x=407;
 int r,temp,a=0;
 public void test()
 {
 temp=x;
 while(x>0)
 {
  r=x%10;
  a=a+(r*r*r);
  x=x/10;
 }
 if(temp==a)
 {
  System.out.println("This is Armstrong no..");
 }
else
{
  System.out.println("This is not Armstrong no..");
} 
} 
}