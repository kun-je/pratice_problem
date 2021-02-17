import java.util.Arrays;
import java.util.Scanner;

public class EH5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		//initialize array x
		for(int i = 0; i < a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
