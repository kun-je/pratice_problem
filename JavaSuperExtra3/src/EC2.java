import java.util.Scanner;

public class EC2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		for (int i = 0; i < x.length; i++)
		{
			if(num == x[i])
			{
				System.out.println("V is in array");
				return;
			}
		}
		System.out.println("is not in array");
	}

}
