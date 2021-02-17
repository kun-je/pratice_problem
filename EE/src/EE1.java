import java.util.Random;
import java.util.Scanner;

public class EE1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < 100; i++)
		{
			int r = new Random().nextInt(n+1);
			System.out.println(r);
		}
	}

}
