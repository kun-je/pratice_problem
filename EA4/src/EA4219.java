import java.util.Scanner;

public class EA4219
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input a,b,c,d,e,f");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		double x,y;
		x= ((double)(e*d-b*f))/(a*d-b*c);
		y=((double)(a*f-e*c))/(a*d-b*c);
		System.out.println(x);
		System.out.println(y);

	}

}
