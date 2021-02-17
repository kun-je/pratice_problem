import java.util.Scanner;

public class EB12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		int sum =0;
		int count = 0;
		while(true)
		{
			n = sc.nextInt();
			if(n == 0)
			{
				break;
			}
			if(n > 0)
			{
				sum += n;
				count ++;
			}
			else
			{
				System.out.println("ERROR");
			}
		}
		if((double)sum == 0.0)
		{
			System.out.println("NO AVERAGE");
		}
		else
		{
			System.out.println((double)sum/count);
		}
	}

}
