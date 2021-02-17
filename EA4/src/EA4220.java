import java.util.Scanner;

public class EA4220
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input raduis");
		int r = sc.nextInt();
		//System.out.println("Please input a point");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = Math.sqrt((a*a)+(b*b));
		if(c> r)
		{
			System.out.println("out of circle");
		}
		else if(c < r)
		{
			System.out.println("in circle");
		}
		else
		{
			System.out.println("on circle");
		}
	}

}
