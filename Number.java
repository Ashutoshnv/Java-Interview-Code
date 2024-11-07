class Number
{ 
public static void main(String args[])
{ 
int num = Integer.parseInt(args[0]); //takes argument as command line      
int remainder, result=0; 
while(num>0) 
{ 
	num = num/10; 
	remainder = num%10; 
	result = result  + remainder; 
	//num = num/10; 
} 
    System.out.println("sum of digit of  number is : "+result); 
} 
} 