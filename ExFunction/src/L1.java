
public class L1
{
	public static double power(double x, int n)
	{
		double sum = 1;
		int i = n;
		while(i > 0)
		{
			if(i%2 == 1)
			{
				sum = sum*x;
				i--;
			}
			else
			{
				x= x*x;
				i = i /2;
			}
		}
		return sum;
	}
	
	public static double power2(double x, int n)
	{
		if(n == 0) return 1;
		if(n == 1) return x;
		if(n/2 == 1)
		{
			return x*power2(x*x, n/2);
		}
		else
		{
			return power2(x*x, n/2);
		}
	}

	public static double fac(int n)
	{
		if(n ==1 || n  == 0)
		{
			return 1;
		}
		return  n * fac(n-1);
	}
	public static void main(String[] args)
	{
		double num = 4;
		double ans = power(num,13);
		System.out.println(ans);
	}

}
