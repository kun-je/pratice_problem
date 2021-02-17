import java.util.Comparator;

public class MaxHeapTest
{

	public static void main(String[] args)
	{
		MaxHeapNoLimit<Integer> h = new MaxHeapNoLimit<Integer>(new IntegerComparator());
		for(int i = 0; i < 10; i++)
		{
			int x =((int)(Math.random()*100));
			System.out.print(x+"\t");
			h.add(x);
		}
		System.out.println();
		while(h.size() > 0)
		{
			//h.print();
			System.out.print(h.getMax()+"\t");
		}
	}

}

class IntegerComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2)
	{
		return o1 - o2;
	}
	
}