import java.util.Scanner;

public class EB2_5
{

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count = sc.nextInt();

		for(int i = 0; i < count ;i++)
		{
			int n = sc.nextInt();
			sum += n;
			if(n > max)
			{
				max = n;
			}
			if(n < min)
			{
				min =n;
			}
		}
		System.out.printf("%.3f\n",(double)sum/count);
		System.out.println(min);

		System.out.println(max);
	}

}
