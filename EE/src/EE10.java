import java.util.Scanner;

public class EE10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i =0; i < 10;i++)
		{
			int n = sc.nextInt();
			sum+= n;
			if(n > max)
			{
				max = n;
			}
			if(n < min)
			{
				min = n;
			}
		}
		System.out.println((double)max);
		System.out.println((double)min);
		//System.out.println(sum);
		System.out.println((double)sum/10);


	}

}
