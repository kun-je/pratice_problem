import java.util.Scanner;

public class EE9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n =sc.nextInt();
		if( m>= n)
		{
			for(int i = n; i < m ;i++)
			{
				System.out.print(i+",");
			}
		}
		System.out.print(m);
	}

}
