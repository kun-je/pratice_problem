import java.util.Scanner;

public class EH12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[10];
		int even_max = Integer.MIN_VALUE;
		int even_min = Integer.MAX_VALUE;
		int odd_max = Integer.MIN_VALUE;
		int odd_min = Integer.MAX_VALUE;
		for(int i =0; i < 10; i++)
		{
			x[i] = sc.nextInt();
			//System.out.println(x[i]);
		}
		for(int i = 0; i<10;i++)
		{
			if(x[i]%2 == 0)
			{
				if(even_max < x[i])
				{
					even_max = x[i];
				}
				if(even_min > x[i])
				{
					even_min = x[i];
				}
			}
			else
			{
				if(odd_max < x[i])
				{
					odd_max = x[i];
				}
				if(odd_min > x[i])
				{
					odd_min = x[i];
				}
			}
		}
		System.out.println(odd_max);
		System.out.println(odd_min);
		System.out.println(even_max);
		System.out.println(even_min);


	}

}
