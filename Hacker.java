import java.util.Scanner;
class Hacker {
    public static void main(String[] args) 
    {
        System.out.println("Enter thr number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("weird");
        }
        else if(n>=2 && n<=5)
        {
            System.out.println("Not Weird");
        }
        else if(n>=6 && n<=20)
        {
            System.out.println("Weid");
        }
        else if(n>=20)
        {
            System.out.println("Not Weird");
        }

    }
}