import java.util.Scanner;

public class EJ5
{

	public static void Even_odd(int n)
	{
		if(n%2==0) 
		{
			System.out.print("EVEN");
		}
		else
		{
			System.out.print("ODD");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Even_odd(sc.nextInt());
	}

}
