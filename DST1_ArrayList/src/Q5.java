import java.util.ArrayList;
import java.util.Random;

public class Q5
{

	public static int testRandom(long seed, int n)
	{
		int count = 1;
		boolean check = false;
		Random ran = new Random(seed);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(ran.nextInt(n));
		//System.out.println(a.get(0));
		//int i  = 1;
		while (true)
		{
			for (int j = 0; j < a.size()-1; j++)
			{
				if (a.get(a.size() - 1).equals(a.get(j)))
				{
					check = true;
					break;
				}
			}
			if(check == true)break;
			a.add(ran.nextInt(n));
		//	System.out.println(a.get(i));
		//	i++;
			count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		/*Random r = new Random(123);
		for (int i = 0; i < 100; i++)
		{
			System.out.println(r.nextInt(100));
		}*/
		
		System.out.println(testRandom(123,100));
		
	}

}
