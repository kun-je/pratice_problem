import java.util.Scanner;

public class Q3
{

	public static void main(String[] args)
	{
		int[] x = new int[10];

		for (int i = 0; i < 10; i++)
		{
			Scanner sc = new Scanner(System.in);
			int value = sc.nextInt();
			x[i] = value;
		}
		int count = 0;
		int neg = 0;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] > 0)
			{
				count++;
			} else
			{
				neg += x[i];
			}
		}
		System.out.printf("[" + count + ", " + neg + "]");
	}

}
