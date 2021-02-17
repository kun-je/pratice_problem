import java.util.Arrays;
import java.util.Scanner;

public class EC7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < c.length/2; i++)
		{
			c[i] = a[i];
		}
		int j = 0;
		for (int i = c.length/2; i < c.length; i++)
		{
			c[i] = b[j];
			j++;
		}
		System.out.println(Arrays.toString(c));
	}

}
