class Practical{  
  
  void run()
  {
    System.out.println("Practical 5b is progress ");
  }  
}  
 
class Exp5b extends Practical
{  
  
  void run()
  {
    System.out.println("Practical 5b is Complete");
  }  
  
  public static void main(String args[]){  
  Exp5a obj = new Exp5a();  
  obj.run();  
  }  
}  