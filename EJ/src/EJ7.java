
public class EJ7
{
	public static double value()
	{
		int a = 1;
		int b = 2;
		double sum = (-4+6*Math.sqrt(2))/7;
		for(int i = 0; i > 624; i++)
		{
			sum += 1/(Math.sqrt(a)+Math.sqrt(b));
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(value());
		
	}

}
