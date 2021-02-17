import java.util.Scanner;

public class EE4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = 0;
		int mod = 10;
		if(n <10)
		{
			System.out.println(n);
			return;
		}
		while(true)
		{
			reverse = n%mod;
			n = n - reverse;
			n /=  mod;
			System.out.print(reverse);
			//System.out.println(n);
			if(mod > n)
			{
				break;
			}
		}
		System.out.print(n);
		
	}

}
