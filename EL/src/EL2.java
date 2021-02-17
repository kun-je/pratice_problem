
public class EL2
{
	public static int differenceArray(int[] d)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arrayabs = 0;
		for (int i = 0; i < d.length; i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
			if (d[i] < min)
			{
				min = d[i];
			}
		}
		arrayabs = Math.abs(max) + Math.abs(min);
		return arrayabs;
	}

	public static int difference2Array(int[][] x)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arrayabs = 0;
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++)
			{
				if (x[i][j] > max)
				{
					max = x[i][j];
				}
				if (x[i][j] < min)
				{
					min = x[i][j];
				}
			}
		}
		arrayabs = Math.abs(max) + Math.abs(min);
		return arrayabs;
	}

	public static void main(String[] args)
	{
		int[] d =
		{ 1, 2, 3, -4, 10, 2 - 3, 5 };
		int[][] x =
		{
				{ 1, 2, 3 },
				{ 2, -4, 5 },
				{ 4, 4, 5 } };

		System.out.println(differenceArray(d));
		System.out.println(difference2Array(x));

	}

}
