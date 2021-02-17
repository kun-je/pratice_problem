import java.util.Scanner;

public class EJ3
{
	public static  int Power3(int x)
	{
		return x*x*x;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(Power3(sc.nextInt()));
	}

}
