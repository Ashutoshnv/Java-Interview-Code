class Operator {
  public static void main(String[] args) {
   
    int a = 12, b = 5,var;
    int result1, result2;
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));
    var = a;
    System.out.println("var using =: " + var);

    var += a;
    System.out.println("var using +=: " + var);

    var *= a;
    System.out.println("var using *=: " + var);
    System.out.println("a is " + a + " and b is " + b);

    System.out.println(a == b);  

    System.out.println(a != b);  

    System.out.println(a > b);  

    System.out.println(a < b);  

    System.out.println(a >= b);  

    System.out.println(a <= b); 
    System.out.println((5 > 3) && (8 > 5));
    System.out.println((5 > 3) && (8 < 5));

    System.out.println((5 < 3) || (8 > 5));
    System.out.println((5 > 3) || (8 < 5));
    System.out.println((5 < 3) || (8 < 5));

    System.out.println(!(5 == 3));
    System.out.println(!(5 > 3));

    System.out.println("Value of a: " + a);
    result1 = ++a;
    System.out.println("After increment: " + result1);

    System.out.println("Value of b: " + b);
    result2 = --b;
    System.out.println("After decrement: " + result2);
  }
}