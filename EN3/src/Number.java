
public class Number
{
	private double a;
	private double b;
	private double c;
	private double avg;
	
	public Number(double xa, double xb, double xc)
	{
		a = xa;
		b = xb;
		c = xc;
	}
	
	public double getavg()
	{
		avg = (a+b+c)/3;
		return avg;
	}
	
	public String toString()
	{
		return "a = "+a+"b = "+b+"c = "+c+"avg = "+ avg;
	}


}
