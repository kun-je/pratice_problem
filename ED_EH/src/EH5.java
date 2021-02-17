import java.util.Scanner;

public class EH5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count =0;
		while(true)
		{
			int n = sc.nextInt();
			sum  += n;
			count++;
			if(n == 0)
			{
				break;
			}
			
		}
		count--;
		System.out.println(sum);
		double avg = (double)sum/count;
		System.out.println(avg);

	}

}
