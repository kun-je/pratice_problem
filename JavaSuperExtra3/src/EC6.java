import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EC6
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		//int t = x[0];
		for (int i = 0; i < x.length/2; i++)
		{
			int t = x[i];
			x[i] = x[x.length-i-1];
			x[x.length-i-1] = t;
				
		}
		//x[x.length-1] = t;
		System.out.println(Arrays.toString(x));
	}

}
