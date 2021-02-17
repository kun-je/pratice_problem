import java.util.Scanner;

public class EC7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int out ;
		int hun = 10;
		int j =	1;
		while(true)
		{
			out = n%hun;
			System.out.print(out/j);
			n -= out;
			hun *=10;
			j*=10;
			if(n <= 0)
			{
				break;
			}
		}

	}

}
