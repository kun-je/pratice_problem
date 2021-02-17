import java.util.Scanner;

public class EA216
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == b  )
		{
			System.out.println("a = b");
		}
		else if( b == c)
		{
			System.out.println("b = c");

		}
		else if(c == a)
		{
			System.out.println("a = c");
		}
		else
		{
			System.out.println("a != b != c");
		}
	}

}
