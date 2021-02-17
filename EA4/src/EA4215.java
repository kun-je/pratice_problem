import java.util.Scanner;

public class EA4215
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+ b == c)
		{
			System.out.println("+");
		}
		else if(a-b == c || b-a == c)
		{
			System.out.println("-");
		}
		else if(a*b == c)
		{
			System.out.println("*");
		}
		else if(a/b == c || b/a == c)
		{
			System.out.println("/");
		}
		else 
		{
			System.out.println("none arithmatic can do it");

		}
	}

}
