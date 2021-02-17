import java.util.Random;

public class EH3
{

	public static void main(String[] args)
	{
		int []a = new int[50];
		for(int i =0; i < a.length;i++)
		{
			 a[i] = new Random().nextInt(100);
		}
		int first = 0;
		int second = 0;
		for(int i = 0; i <a.length;i++)
		{
			for(int j =0; j<a.length;j++)
			{
				if(a[i]+a[j] == 37)
				{
					first =a[i];
					second = a[j];
					break;
				}
			}
		}
		System.out.println(first+"+"+second);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <a.length;i++)
		{
			if(a[i]%2 ==0 &&a[i]> max)
			{
				max = a[i];
			}
		}
		System.out.println(max);

		int count_even =0;
		int count_odd = 0;
		for(int i = 0; i <a.length;i++)
		{
			if(a[i]%2 ==0)
			{
				count_even++;
			}
			else
			{
				count_odd++;
			}
		}
		System.out.println(count_even);
		System.out.println(count_odd);

	}

}
