import java.util.Arrays;
import java.util.Scanner;

public class EC12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []a = new int[5]; 
		for(int i  = 0; i < a.length; i++)
		{
			 a[i] = sc.nextInt();
		}
		int t = a[0];
		for(int i = 0; i < a.length-1; i++)
		{
			a[i]= a[i+1];
		}
		a[a.length-1] = t;
		System.out.println(Arrays.toString(a));
	}

}
