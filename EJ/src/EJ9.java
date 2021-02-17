
public class EJ9
{
	public static double mi(int i)
	{
		double sum = 0;
		for(int j =0; j <= i;j++)
		{
			sum = sum + ((double)j/(j+1));
		}
		return  sum;
	}
	public static void main(String[] args)
	{
		int i = 20;
		System.out.println("i \t\t m(i)");
		for(int j = 1; j <= i ;j++)
		{
			System.out.println(j+"\t\t"+mi(j));
		}
	
	}

}
