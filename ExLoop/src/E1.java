import java.util.Scanner;

public class E1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		//System.out.println("Please input 2 number");
		a = sc.nextInt();
		b = sc.nextInt();	
		int min = Integer.MIN_VALUE;
		if(a> min)
		{
			min =a;
		}
		if(b > min)
		{
			min =b;
		}
		System.out.println(min);
	}

}
