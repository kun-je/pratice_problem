import java.util.Arrays;

public class Sorting {
	
	public static int[] bubbleSort(int[] a)
	{
		for(int j = 0; j < a.length;j++)
		{
			for(int i = 0; i < a.length -j-1; i ++)
			{
				if(a[i] > a[i + 1])
				{
					int t  = a[i];
					a[i] = a[i +1];
					a[i + 1] = t;
				}
			}
		}
		return a;
	}
	
	public static int[] selectionSort(int[] a)
	{
		for(int j = 0; j < a.length;j++)
		{
			int last = a.length-j-1;
			int max_index =0;
			int max = Integer.MIN_VALUE;
			for(int i = 0; i < last; i ++)
			{
				if(a[i] > max)
				{
					max = a[i];
					max_index = i;
				}
			}
			int t  = a[last];
			a[last] = max;
			a[max_index] = t;
		}
		return a;
	}
	
	public static int[] insertionSort(int[] a)
	{
		for(int i = 0; i < a.length;i++)
		{
			int temp = a[i];
			int j;
			for( j = i-1; j >=0; j--)
			{
				if(temp > a[j])
					break;
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		
		}
		return a;
	}
	
	public static void mergeSort(int [] a , int l, int r)
	{
		if( l == r ) return;
		int m = (l + r) /2;
		mergeSort(a, l ,m);
		mergeSort(a, m + 1, r);
		int [] b = new int [r - l + 1];
		int k = 0;
		int i = l;
		int j = m+ 1;
		while( i <= m && j <= r)
		{
			if(a[i] < a[j])
			{
				b[k] = a[i];
				k++; i++;
			}
			else
			{
				b[k] = a[j];
				k++; j++;
			}
		}
		while( i <= m)
		{
			b[k] = a[i];
			k++;
			i++;
		}
		while( j <= r)
		{
			b[k] = a[j];
			k++;
			j++;
		}
		i = l;
		k = 0;
		
		for(; i <=r;i++)
		{
			a[i] = b[k];
			k++;
		}
			
		
	}
	
	public static void quickSort(int [] a, int l , int r)
	{
		if(l >= r)
			return;
		int temp = a[l];
		int i = l;
		int j = r+1;
		while(i < j)
		{
			do
			{
				j--;
			}while (temp < a[j]);
			i++;
			
			while (a[i] < temp)
			{
				if(i == r)
				{
					break;
				}
				i++;
			}
			if(i < j)
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t2 = a[j];
		a[j] = a[l];
		a[l] = t2;
		quickSort(a, l, j-1);
		quickSort(a, j+ 1, r);
	}

	/*public static void main(String[] args) {
		
	/*	int m = 10;
		int [] b = new int [m];
		for(int i = 0; i < m ;i ++)
		{
			b[i] = (int) (Math.random()*1000);
		}
		System.out.println("random  : " +Arrays.toString(b));
		insertionSort(b);
		System.out.println("insertion sort  : " +Arrays.toString(b));
		
		int m = 10;
		int [] b = new int [m];
		for(int i = 0; i < m ;i ++)
		{
			b[i] = (int) (Math.random()*1000);
		}
		System.out.println("random  : " +Arrays.toString(b));
		mergeSort(b, 0, b.length -1);
		System.out.println("merge sort  : " +Arrays.toString(b));
		*/
		/*
		int m = 10;
		int [] b = new int [m];
		for(int i = 0; i < m ;i ++)
		{
			b[i] = (int) (Math.random()*1000);
		}
		System.out.println("random  : " +Arrays.toString(b));
		quickSort(b, 0, b.length -1);
		System.out.println("quick sort  : " +Arrays.toString(b));
		
		
		int n = 100000;
		int [] a = new int [n];
		for(int i = 0; i < n ;i ++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		
	
		long x1,x2;
		x1 = System.currentTimeMillis();
		bubbleSort(a);
		x2 = System.currentTimeMillis();
		System.out.println(" bubble Sort takes time =  " + (x2-x1)+ " milliseconds");
		
		
		
		for(int i = 0; i < n ;i ++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		x1 = System.currentTimeMillis();
		selectionSort(a);
		x2 = System.currentTimeMillis();
		System.out.println(" selection Sort takes time =  " + (x2-x1)+ " milliseconds");
		
		
		
		for(int i = 0; i < n ;i ++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		x1 = System.currentTimeMillis();
		insertionSort(a);
		x2 = System.currentTimeMillis();
		System.out.println(" insertion Sort takes time =  " + (x2-x1)+ " milliseconds");
		

		for(int i = 0; i < n ;i ++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		x1 = System.currentTimeMillis();
		mergeSort(b, 0, b.length -1);
		x2 = System.currentTimeMillis();
		System.out.println(" Merge Sort takes time =  " + (x2-x1)+ " milliseconds");
		
		

		for(int i = 0; i < n ;i ++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		x1 = System.currentTimeMillis();
		quickSort(b, 0, b.length -1);
		x2 = System.currentTimeMillis();
		System.out.println(" Quick Sort takes time =  " + (x2-x1)+ " milliseconds");
		
		
		
		
		
	




	}*/

}
