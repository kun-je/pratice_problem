import java.util.Arrays;

public class EL5
{
	public static int[] maximun(int[] d)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] a = new int [2];
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
		a[0] = max;
		a[1] = min;
		return a;
	}

	public static void main(String[] args)
	{
		int [] d = {1,2,3,4,5,6,7,8,-9};
		System.out.println(Arrays.toString(maximun(d)));
	}

}
