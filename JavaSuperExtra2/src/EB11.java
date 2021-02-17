
public class EB11
{

	public static void main(String[] args)
	{
		int i =0;
		double pi = 0;
		int n = 1;
		while(n<=50000)
		{
			if(i%2 == 0)
			{
				pi += 1.0/n;
				i++;
			}
			else
			{
				pi-= 1.0/n;
				i++;
			}
			n+= 2;
		}
		System.out.printf("%.8f",4*pi);
	}

}
