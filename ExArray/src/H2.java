import java.util.Scanner;

public class H2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[10];
		for(int i = 0 ; i < x.length; i++)
		{
		//	System.out.println("Please input a number");
			x[i] = sc.nextInt();
		}
		for(int i = 0 ; i < x.length; i++)
		{
			System.out.print(x[i]+"\n");

		}
		
	}

}
