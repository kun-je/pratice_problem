import java.util.Scanner;

public class EE8
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n =sc.nextInt();
		if( m>= n)
		{
			for(int i = m; i> n;i--)
			{
				System.out.print(i+",");
			}
		}
		System.out.print(n);
	}

}
