import java.util.Arrays;

public class EL6
{
	public static int[] maximun(int[] d, int i , int j)
	{
		int [] a = new int[2];
		int min1 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		int maxSum = 0;
		int minSum = 0;
		for (int k = i; k <= (i+j)/2 ; k++)
		{
			if (d[k] > max1)
			{
				max1 = d[k];
			}
			if (d[k] < min1)
			{
				min1 = d[k];
			}
		}
		for (int k = (i+j)/2 +1 ; k <= j ; k++)
		{
			if (d[k] > max2)
			{
				max2 = d[k];
			}
			if (d[k] < min2)
			{
				min2 = d[k];
			}
		}
		maxSum = max1+max2;
		minSum = min1+min2;
		a[0] = maxSum;
		a[1] = minSum;
		return a;
	}
	public static void main(String[] args)
	{
		int []a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
		int i = 2;
		int j = 10;
		System.out.println(Arrays.toString(maximun(a,i,j)));
	}

}
