import java.util.Scanner;

public class ED2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("input 2 number");
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		int []z = new int[1];
		sum(x,y,z);
		System.out.println(z[0]);
	}
	public static void sum(int a, int b, int []c)
	{
		c[0] = a+ b;
	}

}
