import java.util.Scanner;

public class EH3_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t= 10;
		int r  =1;
		int p = 0;
		int sum = 0;
		int ecount = 0;
		int ocount = 0;
		for(int i = 0; i < 3;i++)
		{
			p = n% t;
			p = p/r;
			sum = p;
			if(sum%2 == 0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
			t = t * 10;
			r = r*10;
			n = n - p;
		}
		System.out.println(ecount);
		System.out.println(ocount);

	}

}
