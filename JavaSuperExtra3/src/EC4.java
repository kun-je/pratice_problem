import java.util.Arrays;
import java.util.Scanner;

public class EC4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		for (int i = 0; i < x.length; i++)
		{
			if(v == x[i])
			{
				for(int j = i; j < x.length-1;j++)
				{
					x[j] = x[j+1];
				}
				x[x.length-1] = 0;
				break;
			}
		}
		System.out.println(Arrays.toString(x));
		
	}

}
