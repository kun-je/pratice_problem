import java.util.Scanner;

public class D1
{

	public static void main(String[] args)
	{
		//System.out.println("Please input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		int sum = 0;
		while(i <= n)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
