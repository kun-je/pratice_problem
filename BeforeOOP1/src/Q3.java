import java.util.Scanner;

public class Q3
{
	public static int roundSum(int a, int b, int c)
	{
		int sum = a+b+c;
		return sum;
	}
	
	public static int num(int a)
	{
		if(a%10 >= 5)
		{
			a = a + (10-(a%10));
		}
		else
		{
			a = a -(a%10);
		}
		return a;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(roundSum(num(a),num(b),num(c)));
		

	}

}
