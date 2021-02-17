import java.util.Scanner;

public class EH10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		int pos = 0;
		int neg =0;
		while(true)
		{
			n = sc.nextInt();
			if(n ==0)
			{
				break;
			}
			else if( n > 0)
			{
				pos+=n;
			}
			else
			{
				neg+=n;
			}
		}
		System.out.println(pos);
		System.out.println(neg);
	}

}
