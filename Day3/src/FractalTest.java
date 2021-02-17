
public class FractalTest
{

	public static void main(String[] args)
	{
		fractal a = new fractal();
		a.numerator  = 1;
		a.denominator = 2;
		
		fractal b = new fractal();
		b.numerator  = 1;
		b.denominator = 2;
		
		fractal c = a.add(b);
		System.out.println(c.numerator + "/" + c.denominator);
		System.out.println(fractal.GCD(24, 16));
		
	}

}
