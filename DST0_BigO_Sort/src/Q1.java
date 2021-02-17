import java.util.Arrays;

public class Q1
{
	public static int[] bubblesort(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		return a;
	}

	public static int[] selectionSort(int[] a)
	{
		// number of times we need to loop
		for (int i = 0; i < a.length - 1; i++)
		{
			int min = Integer.MAX_VALUE;
			int index = i;
			// finding min number
			for (int j = i; j < a.length; j++)
			{
				if (a[j] < min)
				{
					index = j;
					min = a[j];
				}
			}
			int t = a[i];
			a[i] = a[index];
			a[index] = t;
		}
		return a;
	}

	public static int[] insertionSort(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			int j = i + 1;
			while (j > 0 && a[j] < a[j-1])
			{
				int t = a[j];
				a[j] = a[j-1];
				a[j-1] = t;
				j--;
			}
		}
		return a;
	}

	public static void mergeSort(int []a, int l, int r)
	{
		if(l == r )return;
		int m = (l+r)/2;
		
		mergeSort(a,l,m);
		mergeSort(a,m+1, r);
		
		int []b = new int[r-l+1];
	}
	public static void main(String[] args)
	{
		int[] a = new int[]
		{ 20, 90, 95, 33, 25, 83, 3, 56, 71 };
		// bubblesort(a);
		// selectionSort(a);
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
