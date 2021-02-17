import java.util.Scanner;

public class Ex1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("input 2 number");
		int x,y,z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sum(x,y);
		System.out.println(z);
	}
	public static int sum(int a, int b)
	{
		int sum = a+ b;
		return sum;
	}

}
