import java.util.Scanner;

public class EB4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count =0;
		while(true)
		{
			int n = sc.nextInt();
			if(n >= 100 && n <= 200)
			{
				count++;
			}
			if(n == 0)
			{
				break;
			}
		}
		System.out.println(count);
	}

}
