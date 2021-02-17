import java.util.Scanner;

public class EE11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n;i++)
		{
			int r = sc.nextInt();
			sum+= r;
			if(r > max)
			{
				max = r;
			}
			if(r < min)
			{
				min = r;
			}
		}
		System.out.println((double)max);
		System.out.println((double)min);
		//System.out.println(sum);
		System.out.println((double)sum/n);
	}
	

}
