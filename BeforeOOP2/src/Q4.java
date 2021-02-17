import java.math.BigInteger;

public class Q4
{
	public static double factorial(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		return factorial(n-1)*n;
	}
	
	public static BigInteger easyline(int n)
	{
		BigInteger sum = new BigInteger("0");
		BigInteger v = new BigInteger("0");
		double value = 0;
		for(int i= 0; i <= n;i++)
		{
			double a = factorial(n)/(factorial(i)*factorial(n-i));
			value = Math.pow(a,2.0);
			v = BigInteger.valueOf((int)value);
			sum = sum.add(v);
		}
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(easyline(4));
	}

}
