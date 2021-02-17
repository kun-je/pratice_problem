import java.util.Arrays;
import java.util.Scanner;

public class J3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		double mean;
		for (int i = 0; i < x.length; i++)
		{
		//	System.out.println("Please input a number");
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		mean =(x[4]+x[5])/2;
	
		System.out.println(mean);

	}

}
