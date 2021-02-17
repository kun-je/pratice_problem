import java.util.Scanner;

public class E5_13
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double n1;
		n1 = Math.sqrt(2*Math.PI*n)*(Math.pow((n/Math.E),n));
		System.out.println(n1);
	}

}
