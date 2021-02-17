import java.util.Scanner;

public class EA4210
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double d = 0;
		if(c == 1)
		{
			d = a+b;
		}
		else if(c == 2)
		{
			d = a-b;
		}
		else if(c == 3)
		{
			d = a*b;
		}
		else if(c == 4)
		{
			d = (double)a/b;
		}
		System.out.println(d);
	}

}
