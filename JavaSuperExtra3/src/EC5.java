import java.util.Arrays;
import java.util.Scanner;

public class EC5
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
		int index = sc.nextInt();
		int temp = x[index];
		x[index] = v;
		for (int i = x.length-2; i > index; i--)
		{
			
			x[i+1] = x[i];
			
		}
		x[index+1] = temp;
		System.out.println(Arrays.toString(x));
	}

}
