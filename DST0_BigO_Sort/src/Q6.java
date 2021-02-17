import java.util.Arrays;

public class Q6
{

	public static void main(String[] args)
	{
		
		//6.1
		int m = 10;
		int [] a = new int [m];
		for(int i = 0; i < m ;i ++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		System.out.println("random  : " +Arrays.toString(a));
		long x1;
		long x2;
		x1 = System.currentTimeMillis();
		Sorting.bubbleSort(a);
		x2 = System.currentTimeMillis();
		System.out.println("bubble sort  : " +Arrays.toString(a));
		System.out.println(" bubble sort takes time =  " + (x2-x1)+ " milliseconds");
		
		
		
		
		int [] b = new int [m];
		for(int i = 0; i < m ;i ++)
		{
			b[i] = (int) (Math.random()*1000);
		}
		System.out.println("random  : " +Arrays.toString(b));
		x1 = System.currentTimeMillis();
		Sorting.insertionSort(b);
		x2 = System.currentTimeMillis();
		System.out.println("insertion sort  : " +Arrays.toString(b));
		System.out.println(" insertion sort takes time =  " + (x2-x1)+ " milliseconds");
		
		
		//6.2
		
		int [] c = new int [m];
		for(int i = 0; i < m ;i ++)
		{
			c[i] = (int) (Math.random()*1000);
		}
		System.out.println("random  : " +Arrays.toString(c));
	
		x1 = System.currentTimeMillis();
		Sorting.bubbleSort(c);
		x2 = System.currentTimeMillis();
		System.out.println("bubble sort  : " +Arrays.toString(c));
		System.out.println(" bubble sort takes time =  " + (x2-x1)+ " milliseconds");
		
		
		int [] d = new int [m];
		for(int i = 0; i < m ;i ++)
		{
			d[i] = (int) (Math.random()*1000);
		}
		System.out.println("random  : " +Arrays.toString(d));
	
		x1 = System.currentTimeMillis();
		Q1.bubblesort(d);
		x2 = System.currentTimeMillis();
		System.out.println("bubble sort  : " +Arrays.toString(d));
		System.out.println(" bubble sort takes time =  " + (x2-x1)+ " milliseconds");
		
		
		
		
		

		
	}

}
