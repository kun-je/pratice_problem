
public class fractal
{
	public int numerator;
	public int denominator;
	
	public fractal add(fractal f)
	{
		fractal result = new fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator * f.denominator + f.numerator*denominator;
		/*int gcd = GCD(result.denominator,result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;*/
		return result;
	}
	
	public fractal sub(fractal f)
	{
		fractal result = new fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator * f.denominator - f.numerator*denominator;
		/*int gcd = GCD(result.denominator,result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;*/
		return result;
	}
	
	public fractal mul(fractal f)
	{
		fractal result = new fractal();
		result.denominator = denominator * f.denominator;
		result.numerator = numerator* f.numerator;
	/*	int gcd = GCD(result.denominator,result.numerator);
		result.denominator /= gcd;
		result.numerator /= gcd;*/
		return result;
	}
	
	public static int GCD(int a, int b)
	{
		if(a>b)
		{
			
		}
		else
		{
			int t =a;
			a = b;
			b = t;
		}
		while(b> 0)
		{
			a = a% b;
			int t =a;
			a = b;
			b = t;
		}
		return a;
	}
	
	public static int LCD(int a, int b)
	{
		
	}
}
