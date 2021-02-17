
public class EH1
{

	public static void main(String[] args)
	{
		double i = 1.03;
		double p = 0;
		double r  =500;
		double t = 0;
		while(p < 20000)
		{
			p = i*r;
			r = p;
			t++;
		}
		System.out.println((int)t);
		
	}

}
