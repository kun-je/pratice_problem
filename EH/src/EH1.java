import java.util.Random;

public class EH1
{

	public static void main(String[] args)
	{
		int []x = new int[100];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < x.length;i++)
		{
		 x[i] = new Random().nextInt(1000);
		}
		for(int i = 0; i < x.length;i++)
		{
			System.out.println(x[i]);
			if(min > x[i])
			{
				min = x[i];
			}
			if(max < x[i])
			{
				max = x[i];
			}
			sum+= x[i];
			
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println((double)sum/100);
		
	}

}
