import java.util.Scanner;

public class ED4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("input 3 numbers");
		int x,y,w,z;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		z= max3(x,y,w);
		System.out.println(z);
	}
	
	public static int max(int a, int b)
	{
		return a>b?a:b;//if a more than b return a , if not return b
	}
	
	public static int max3(int a, int b, int c)
	{
		int m = max(a,b);
		m = max(m,c);
		return m; // return max(max(a,b),c);
	}

}
