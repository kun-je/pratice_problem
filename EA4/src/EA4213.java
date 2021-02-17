import java.util.Scanner;

public class EA4213
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input a number");
		int a = sc.nextInt();
		double b;
		double c;
		double d =0;
		if(a== 1)
		{
			//System.out.println("Please input 2 more number");
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = b+c;
		}
		else if(a == 2)
		{
			//System.out.println("Please input 2 more number");
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = b*c;
		}
		else if(a == 3)
		{
			//System.out.println("Please input 2 more number");
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = (double)b/c;
		}
		else
		{
			System.out.println("Choose only 1-3");
			return;
		}
		System.out.println(d);
	}

}
