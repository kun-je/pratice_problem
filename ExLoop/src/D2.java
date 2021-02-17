import java.util.Scanner;

public class D2
{

	public static void main(String[] args)
	{
		//System.out.println("Please input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		int sum = 1;
		while(i <= n)
		{
			sum = sum * i;
			i++;
		}
		System.out.println(sum);
	}

}
