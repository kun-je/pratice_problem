import java.util.Scanner;

public class EA4211
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input x");
		int x = sc.nextInt();
		int y=0;
		if(x>100)
		{
			y = 20;
		}
		else
		{
			y = 0;
		}
		System.out.println(y);
	}

}
