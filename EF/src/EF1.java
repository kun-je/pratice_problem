import java.util.Scanner;

public class EF1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double min = Integer.MAX_VALUE;
		double sum_noMin = 0;
		double sum = 0;
		for (int i = 0; i < 4; i++)
		{
			double n = sc.nextDouble();
			if(n < min)
			{
				min = n;
			}

			sum+= n;
			sum_noMin = sum - min;
		}
		System.out.println(sum);
		System.out.println(sum_noMin);
		

	}

}
