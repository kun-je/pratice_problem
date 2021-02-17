import java.util.Scanner;

public class EA426
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("hours and minutes");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int pay = 0;
		if(h == 0)
		{
			pay = 0;
		}
		else if(h <= 1 && m == 0)
		{
			pay = 0;
		}
		else
		{
			pay = (h-1)*30;
			if(m > 0)
			{
				pay = pay + 30;
			}
		}
		System.out.println(pay);
	}

}
