
public class computePi
{

	public static void main(String[] args)
	{
		double sum = 0;
		int n = 5000;
		double k ;
		for(int i = 1 ; i <= n; i++)
		{
			k =  2*i -1;
			sum += 1.0/k;
			i++;
			k = 2*i -1;
			sum -= 1.0/k;
		}
		System.out.println(sum*4);
	}
}
