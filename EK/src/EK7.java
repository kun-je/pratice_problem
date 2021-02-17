
public class EK7
{

	public static int factorial(int n)
	{
		int sum  = 1;
		for(int i  = 1; i <= n ; i ++)
		{
			sum *= i ;
		}
		return sum;
	}
	
	public static void reverse(String t)
	{
		StringBuilder s = new StringBuilder();
		for(int i = t.length()-1; i >= 0; i--)
		{
			s.append(t.charAt(i));
		}
		System.out.println(s.toString());
	}
	
	public static void log2(int n)
	{
		int sum = 2;
		int i =1;
		for(i = 1;sum <= n; i++ )
		{
			sum = sum* 2;
			
		}

		if(sum > n)
		{
			i -= 1;
			System.out.println(i);
		}
		else
		{
			System.out.println(i);
		}
	}
	
	public static void gcd(int n, int m)
	{
		for(int i = n; i >= 1; i--)
		{
			if(n%i == 0 && m%i == 0)
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
		reverse("12345678");
		log2(32);
		gcd(34,13);
	}

}
