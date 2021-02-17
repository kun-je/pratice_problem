import java.util.Arrays;

public class Q6
{
	public static int[] checkAndDecrease(int[] a)
	{
		int countEmpty = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == 0)
			{
				countEmpty++;
			}
		}
		if (countEmpty > a.length * 0.75)
		{
			int[] b = new int[a.length / 2];
			int j = 0;
			for (int i = 0; i < a.length; i++)
			{

				if (a[i] != 0)
				{
					b[j] = a[i];
					j++;
				}

			}
			return b;
		}
		return a;
	}

	public static void main(String[] args)
	{
		int[] a = new int[]
		{ 0, 0, 0, 0, 8, 0, 0, 5, 0, 0, 3};
		System.out.println(Arrays.toString(checkAndDecrease(a)));
	}

}
