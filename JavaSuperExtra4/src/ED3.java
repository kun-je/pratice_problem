import java.util.Scanner;

public class ED3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("input 2 number");
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		int z;
		z= max(x,y);
		System.out.println(z);
	}
	
	public static int max(int a, int b)
	{
		return a>b?a:b;//if a more than b return a , if not return b
	}

}
