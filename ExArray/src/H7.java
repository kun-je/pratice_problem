import java.util.Scanner;

public class H7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[10];
		int sum = 1;
		for(int i = 0 ; i < x.length; i++)
		{
		//	System.out.println("Please input a number");
			x[i] = sc.nextInt();
		}
		for(int i = 0 ; i < x.length; i++)
		{
			sum *= x[i];
		}
		System.out.println(sum);
	}

}
