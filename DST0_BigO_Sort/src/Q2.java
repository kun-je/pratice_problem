import java.util.Arrays;
import java.util.Scanner;

public class Q2
{

	public static void main(String[] args)
	{
		int[] a = new int[5];
		String c = "";
		Scanner sc = new Scanner(System.in);
		do
		{
			for (int i = 0; i < 5; i++)
			{
				a[i] = sc.nextInt();
				//System.out.println("5");
			}
			sc.nextLine();
			c = sc.nextLine();
			
			if(c.equals("s"))
			{
				Sorting.selectionSort(a);
			}
			else if(c.equals("b"))
			{
				Q1.bubblesort(a);
			}
			else if(c.equals("i"))
			{
				Sorting.insertionSort(a);
			}else if(c.equals("m"))
			{
				Sorting.mergeSort(a, 0 , a.length-1);
			}else if(c.equals("q"))
			{
				Sorting.quickSort(a,0,a.length-1);
			}
			/*else if(c.equals("r"))
			{
				Sorting.radixSort(a);
			}else if(c.equals("h"))
			{
				Sorting.heap(a);
			}*/
			System.out.println(c);
			System.out.println(Arrays.toString(a));

		}
		while (c != "x");
	}

}
