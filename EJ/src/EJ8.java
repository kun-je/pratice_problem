
public class EJ8
{
	public static int checkPrime(int n)
	{
		int prime = 1;
		if(n == 0 || n == 1)
		{
			prime = 0;
			return prime;
		}
		else
		{
			for(int i=2;i<=n;i++)
			{      
			  if(n%i==0)
			  {      
			     prime = 0;      
			     return prime; 
			  } 
			  else
			  {
				 return prime;
			  }
		    } 
			return prime;
		}
	}
	public static void perfectNum()
	{
		int ans = 0;
		int count = 0;
		for(int i = 5; i < 10; i++)
		{
			if(checkPrime(i) == 1)
			{
				ans=(int)Math.pow(2,i-1)*((int)Math.pow(2,i)-1);
				count++;
				System.out.println(ans);
			}
			if(count == 2)
			{
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		perfectNum();
	}

}
