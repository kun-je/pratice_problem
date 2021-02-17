import java.util.Scanner;

public class EH4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <=12;i++)
		{
			sum = n *i;
			System.out.printf("%d * %d = %d\n",n,i,sum);
		}
	}

}
