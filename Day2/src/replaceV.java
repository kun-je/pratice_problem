import java.util.Arrays;
import java.util.Scanner;

public class replaceV
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[10];
		for(int i = 0 ; i < x.length; i++)
		{
			System.out.println("Please input a number");
			x[i] = sc.nextInt();
		}
		System.out.println("input v");
		int v = sc.nextInt();
		System.out.println("input index");
		int index = sc.nextInt();
		for(int i = x.length-1; i> index; i--)
		{
			x[i]= x[i-1];
		}
		x[index]= v;
		System.out.println(Arrays.toString(x));
	}

}
