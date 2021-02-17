import java.util.Scanner;

public class Kangaroo
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int m = b-1-a;
		int n = c-b-1;
		m = m > n ? m:n;
		System.out.println(m);
	}

}
