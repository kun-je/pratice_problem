import java.util.Scanner;

public class J4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			//System.out.println("Please input a number");
			x[i] = sc.nextInt();
		}
		int maxcount = 0;
		int value = x[0];
		for(int i  = 0; i < x.length; i++)
		{
			int count = 0;
			for(int j = 0; j < x.length ; j++)
			{
				if(x[i] == x[j])
				{
					count++;
				}
			}
			if(count > maxcount)
			{
				maxcount = count;
				value = x[i];
			}
			
		}
		System.out.println(value);
		System.out.println(maxcount);
	}

}
