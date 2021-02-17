import java.util.Scanner;

public class E2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		//System.out.println("Please input 2 number");
		a = sc.nextInt();
		b = sc.nextInt();
		int k =a;
		while(a%k != 0 || b%k != 0)
		{
			k--;
		}
		System.out.println(k);
	}

}
