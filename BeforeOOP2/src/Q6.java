import java.util.Scanner;

public class Q6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = n * n;
		String ns = "" + n;
		String ss = "" + s;
		//int lns = ns.length() - 1;
		//int lss = ss.length() - 1;
		if (ss.endsWith(ns))
		{
			System.out.println("Automorphic");
		} else
		{
			System.out.println("NotAutomorphic");
		}
	}

}
