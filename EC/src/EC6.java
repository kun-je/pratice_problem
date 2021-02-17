import java.util.Scanner;

public class EC6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double min, max , avg, sum = 0;
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int i = 0; i < input; i++)
		{
			int num = sc.nextInt();
			if(num > max)
			{
				max = (double)num;
			}
			if(num < min)
			{
				min = (double)num;
			}
			sum += num;
		}
		avg = (double)sum/input;
		System.out.println(min);
		System.out.println(max);
		System.out.println(avg);

		
	}

}
