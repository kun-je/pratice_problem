import java.util.Scanner;

public class Q2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = 0;
		for(int i =1; i<= n;i++)
		{
			ans+= 1.0/Math.pow(i, 2);
		}
		ans = Math.sqrt(ans);
		System.out.println(ans);
	}

}
