import java.util.Scanner;

public class EB2
{

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < 10 ;i++)
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
		System.out.println(sum/10.0);
		System.out.println(min);
		System.out.println(max);

		
	}

		
	

}
