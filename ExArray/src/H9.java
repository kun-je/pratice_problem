import java.util.Scanner;

public class H9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[10];
		for(int i = 0 ; i < x.length; i++)
		{
			//System.out.println("Please input a number");
			x[i] = sc.nextInt();
		}
		int a = x[1];
		for(int i = 0; i < x.length; i++)
		{
			if(x[i]> a)
			{
				a = x[i];
			}
		}
		System.out.println(a);
	}

}