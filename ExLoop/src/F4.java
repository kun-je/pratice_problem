import java.util.Scanner;

public class F4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			//System.out.println("Please input number");
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < x.length; i++)
		{
			int k = 1;
			int count = 0;
			while (k <= x[i])
			{
				if (x[i] % k == 0)
				{
					count++;
				}
				k++;
			}
			if (count == 2)
			{
				System.out.println("an array have prime number");
				return;
			}
			
		}
		System.out.println("doesn't have prime");


	}

}
