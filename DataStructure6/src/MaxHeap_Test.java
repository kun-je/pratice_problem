import java.util.Arrays;

public class MaxHeap_Test
{

	public static void main(String[] args)
	{
		MaxHeap mh = new MaxHeap();
		int[] a = new int[20];
		for(int i = 0; i < mh.x.length;i++)
		{
			//mh.add((int)(Math.random()*100));
			a[i] = ((int)(Math.random()*100));
		}
		for(int i = 0; i < 20; i++)
		{
			//a[i] = i;
			System.out.printf("%4d",a[i]);
		}
		/*System.out.println("\n "+ Arrays.toString(mh.x));
		mh.removeMax();
		System.out.println("\nAfter Maximun data was removed\n");
		System.out.println(""+Arrays.toString(mh.x));*/
		
		System.out.println("\n " + Arrays.toString(a));
		mh.sort(a);
		System.out.println("After using Heap Sort");
		System.out.println(" "+Arrays.toString(a));
		
	}

}
