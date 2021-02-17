
public class L3
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
	
	public static double fac(double n)
	{
		double result = 1;
		for(int i = 1; i <= n ; i++)
		{
			result*=i;
		}
		return result;
	}
	
	public static double sin(double x)
	{
		double result  = 0;
		for(int i =1 ; i <= 17; i= i+2)
		{
			if(i%4 == 1)
			{
				result = result + power(x,i)/fac(i);
			}
			else
			{
				result = result - power(x,i)/fac(i);
			}
		}
		return result;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(power(2,5));
		System.out.println(fac(5));
		System.out.println(sin(Math.PI/2));
	}

}
