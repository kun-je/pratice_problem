import java.util.Arrays;
import java.util.Scanner;

public class Q8
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int value ;
		if(start > end)
		{
			 value = start - end;
		}
		else
		{
			 value = end - start;

		}
		int []x = new int[value];
		for(int i = 0; i < x.length;i++)
		{
			x[i] = start;
			start++;
		}
		System.out.println(Arrays.toString(x));
	}

}
