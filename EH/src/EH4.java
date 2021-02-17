import java.util.Scanner;

public class EH4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[10];
		//initialize array x
		for(int i = 0; i < x.length;i++)
		{
			x[i]= sc.nextInt();
		}
		
		int sum = 0;
		
		//go through array x to see there are same int
		for(int i =0; i<x.length;i++)
		{
			int count = 0;
			for(int j = 0; j <x.length;j++)
			{
				if(x[i]== x[j])
				{
					count++;
				}
			}
			count--;
			if(count> 0)
			{
				System.out.println(x[i]);
				sum++;
			}
		}

		System.out.println(sum);

	}

}
