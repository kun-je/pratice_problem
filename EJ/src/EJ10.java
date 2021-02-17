
public class EJ10
{

	public static double mi(int i)
	{
		double sum = 0;
		for(int j =2; j <= i;j++)
		{
			sum = sum + ((double)Math.pow(1,j+1)/j);
		}
		return  sum;
	}
	public static void main(String[] args)
	{
		int i = 50;
		System.out.println("i \t\t m(i)");
		for(int j = 5; j <= i ;j= j+ 5)
		{
			System.out.println(j+"\t\t"+mi(j));
		}
	
	}

}
