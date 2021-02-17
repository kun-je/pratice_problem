import java.util.Scanner;

public class Q6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[3];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < x.length;i++)
		{
			x[i]= sc.nextInt();
		}
		for(int i = 0; i < x.length;i++)
		{
			if(max < x[i])
			{
				max = x[i];
			}
		}
		System.out.print(max);
	}

}
