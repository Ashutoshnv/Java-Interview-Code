public class Pattern2 {

    public static void main(String[] args) {
    
   // int 5 = 5;
    
    for (int rows = 1; rows <= 5; rows++)   //Outer loop for rows
    {
    
    for (int space = 1;  space<=5-rows; space++) //Inner loop for Col 
    { 
        System.out.print(" "); //Print *
    }
    for (int col=1;col<=2*rows-1;col++) 
    {
        System.out.print("*");        
    }
    System.out.println(); //New line
    }
    }
    }