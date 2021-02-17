import java.util.Scanner;

public class EH8
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i< 10;i++)
		{
			int n = sc.nextInt();
			if(n> max)
			{
				max2 = max;
				max = n;
			}
		}
		System.out.println(max2);
	}

}
