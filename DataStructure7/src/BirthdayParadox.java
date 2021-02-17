
public class BirthdayParadox
{

	public static void main(String[] args)
	{
		int n = 1;
		double p,x= 1;
		for(;;n++)
		{
			x= x*(365.0+1-n)/365.0;
			p = 1 -x;
			if(p > 0.5)break;
		}
		System.out.println(n);
	}

}
