import java.util.Scanner;

public class EA4214
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b > c && b+c > a && a+c> b)
		{
			System.out.println("triangle");
		}
		else
		{
			System.out.println("not triangle");

		}


		
	}

}
