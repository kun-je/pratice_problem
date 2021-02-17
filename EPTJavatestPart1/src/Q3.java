import java.util.Scanner;

public class Q3
{

	public static void main(String[] args)
	{

		int k = 1;
		int max = Integer.MIN_VALUE;
		int value = 0;
		int count = 0;
		for (int i = 1; i < 1000; i++)
		{
			k = i;
			count = 0;
			while (true)
			{
				if (k % 2 == 0)
				{
					k = k / 2;
					count++;
				} else
				{
					k = 3 * k + 1;
					count++;
				}
				if (k == 1)
				{
					break;
				}
			}
			if (count > max)
			{
				max = count;
				value = i;
			}
		}
		System.out.println(value);
		System.out.println(count);
	}
}
