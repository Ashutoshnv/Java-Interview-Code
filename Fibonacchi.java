/*class Fibonacchi
{
    public static void main(String[] args) 
    {
        int a=0,b=1,c=0;
        System.out.println(a+""+b);
        for (int i =1;i<=10;i++)
        {
            c=a+b;
            System.out.println(c);  //fibonacchi series
            a=b;
            b=c;
        }
        
    }
}*/
/*class Fibonacchi
{
    public static void main(String[] args) 
    {
        int a=10, b=20;
        System.out.println("Befor swaping of Number"+a+b);
        a=a+b;
        b=a-b;  
        a=a-b;
        System.out.println( "After Swaping of number "+a+b); // Swaping of number without using third
    }
}*/
/*
class Fibonacchi
{
    public static void main(String[] args) 
    {
        int fact=1;
        for (int i = 1; i <=5; i++)             //Factorial of a number
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
    */


    class Fibonacchi
{
    public static void main(String[] args) 
    {
        String name =" Ashutosh";
        int lang = name.length();
        String rev=" ";
        String temp=name;
        for (int i =lang-1 ; i >=0; i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        if (temp==rev) 
        {
            System.out.println("this is pallendrome");
        }
        else
        {
            System.out.println("is it not pallendrome");
        }
    }
}
    

/*    class Fibonacchi
{
    public static void main(String[] args) 
    {
        int num=123456789;
        int rev=0,rem=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
    */