import java.util.Scanner;

public class E3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		//System.out.println("Please input 2 number");
		a = sc.nextInt();
		b = sc.nextInt();
		int k = 1;
		while(k%a != 0 || k%b != 0)
		{
			k++;
		}
		System.out.println(k);
	}

}
