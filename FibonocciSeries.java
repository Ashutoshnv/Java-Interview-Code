class FibonocciSeries 
{   
	public static void main(String args[])  
	{     
		int num1 = 1,num2=1,ans;  
		System.out.println(num1);    
		while (num2< 100)   
			{    
				System.out.println(num2);   
				ans = num1+num2;     
				num1 = num2; 
				num2 =ans;
			}
		}
	}