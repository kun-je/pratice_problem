import java.util.Scanner;

public class EA425
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input A, B ,C, D, m");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int m = sc.nextInt();
		int Y;
		if(m>5)
		{
			Y = A*m*2+B*m +C;
		}
		else if(m == 5)
		{
			Y = A*m*2+B*m-C;
		}
		else
		{
			Y = A*m*2 +B*m;
		}
		System.out.println(Y);
	}

}
