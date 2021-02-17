import java.util.Scanner;

public class EC3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int store =0 ;
		for (int i = 0; i < x.length; i++)
		{
			if(x[i]> max)
			{
				max = x[i];
				store = i;
			}
		}
		System.out.println(max);
		System.out.println(store);

		
		
	}

}
