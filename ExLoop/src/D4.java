import java.util.Scanner;

public class D4
{

	public static void main(String[] args)
	{
		//System.out.println("Please input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		double sum = 0;
		while(i <= n)
		{
			sum = sum + 1.0/(i*i);
			i++;
		}
		System.out.println(sum);
	}

}
