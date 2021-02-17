import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EL1
{
	public static int count(int[] d, int x)
	{
		int counter = 0;
		for(int i = 0; i < d.length; i++)
		{
			if(d[i] == x)
			{
				counter ++;
			}
		}
		return counter;
	}
	
	public static int mode(int[] d)
	{
		int max = 0;
		int mode = 0;
		for(int i = 0 ; i < d.length; i++)
		{
			int count = 0;
			for(int j = 0; j < d.length;j++)
			{
				if(d[i] == d[j])
				{
					count++;
				}
			}
			if(count > max)
			{
				max = count;
				mode = d[i];
			}
		}
		return mode;
	}
	public static boolean majority(int[] d)
	{
		int max = 0;
		for(int i = 0 ; i < d.length; i++)
		{
			int count = 0;
			for(int j = 0; j < d.length;j++)
			{
				if(d[i] == d[j])
				{
					count++;
				}
			}
			if(count > max)
			{
				max = count;
			}
		}
		System.out.println(d.length);

		if((d.length)%2 == 0 && max > (d.length)/2)
		{
			return true;
		}
		else if((d.length)%2 != 0 && max > (d.length)/2)
		{
			return true;
		}
		return false;
	}
	
	public static void insert(int []d, int i , int x)
	{
		for(int j = i;  j < d.length-1;j++)
		{
			int temp = d[j];
			d[j] = x;
			x = temp;
		}
		System.out.println(Arrays.toString(d));
	}
	
	public static void remove(int[] d, int i)
	{
		for(int j = i; j < d.length-1;j ++)
		{
			d[j] =d[j+1];
		}
		d[d.length-1] = 0;
		System.out.println(Arrays.toString(d));
	}
	
	public static void shuffle(int[] d)
	{
		List<Integer> randomly = new ArrayList<>();
		for(int i = 0; i < d.length; i++)
		{
			randomly.add(d[i]);
		}
		Collections.shuffle(randomly);
		System.out.println(randomly);
		 
	}
	
	public static int[] shuffling(int[] d)
	{
		List<Integer> randomly = new ArrayList<>();
		for(int i = 0; i < d.length; i++)
		{
			randomly.add(d[i]);
		}
		Collections.shuffle(randomly);
		int[] x = new int[randomly.size()];
		for(int i = 0;i < x.length;i++)
		{
			    x[i] = randomly.get(i);
		}
		return x;
	}
	
	public static boolean isSorted(double[] dd)
	{
		for(int i = 0; i < dd.length-1;i++)
		{
			if(dd[i]>dd[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSorting(String[] ddd)
	{
		int[] x = new int[ddd.length];
		for(int j = 0; j < x.length;j++)
		{
			x[j] = Integer.parseInt(ddd[j]);
		}
		for(int i = 0; i < x.length-1;i++)
		{
			if(x[i]>x[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	public static int[] inRange(int[] d)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < d.length; i++)
		{
			if (d[i] > max)
			{
				max = d[i];
				maxIndex = i;
			}
			if (d[i] < min)
			{
				min = d[i];
				minIndex = i;
			}
		}

		int[] a = new int [maxIndex-minIndex+1];
		int count = 0;
		for(int i = minIndex; i <= maxIndex ; i++)
		{
			a[count] = d[i];
			count++;
		}
		return a;
	}
	

	
	public static void main(String[] args)
	{
		int[] d = {1,2,3,4,5,5,5,9,5,5,5,6,6};
		double[] dd = {1,2,6,4,5,5,5,5,5,5,5,6,6};
		String[] ddd = {"1","2","3","4","5","6","7","8","9"};
		int[] drange = {1,2,-3,4,5,5,5,9,5,5,5,6,6};
		int x = 5;
		int i = 2;
		System.out.println(count(d,x));
		System.out.println(mode(d));
		System.out.println(majority(d));
		insert(d,i,x);
		remove(d,i);//remove finish then bring d to shuffle
		shuffle(d);
		System.out.println(Arrays.toString(shuffling(d)));
		System.out.println(isSorted(dd));
		System.out.println(isSorting(ddd));
		System.out.println(Arrays.toString(inRange(drange)));


	}

}
