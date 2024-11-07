class Sus extends Thread implements Runnable
{
 static Thread th; 
 float rad,r; 
 public Sus()
{
 th= new Thread(); 
 th.start();
}
 public void op()
{
 System.out.println("\nThis is OP"); 
 if(rad==0)
  {
    System.out.println("Waiting for input radius");
  } 
try
{
 wait();
}
catch(Exception ex)
{}

}

public void ip()
{
 System.out.println("\nThis is IP"); r=7;
 rad= r; System.out.println(rad);
 System.out.println("Area = "+3.14*rad*rad); notify();
}
 public static void main(String arp[])
{
try{
 Sus s1 = new Sus(); 
 System.out.println("\nReady to go"); 
 Thread.sleep(2000); 
 System.out.println("\nI am resuming"); 
 th.suspend();
 Thread.sleep(2000); 
 th.resume();
 System.out.println("\nI am resumed once again"); 
 s1.op();
 s1.ip();
 s1.op();
}
 catch(Exception e)
{}
}

