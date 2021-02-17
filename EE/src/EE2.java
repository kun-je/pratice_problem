import java.util.Random;
import java.util.Scanner;

public class EE2
{

	public static void main(String[] args)
	{
		int r = new Random().nextInt(10) + 1;
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (r == n)
			{
				break;
			}
			if(n < r)
			{
				System.out.println("n is less than r");
			}
			if(n > r)
			{
				System.out.println("n is more than r");
			}
		}
	}

}
