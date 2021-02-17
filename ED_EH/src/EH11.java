import java.util.Scanner;

public class EH11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		int pos = 0;
		int posc=0;
		int negc=0;
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
				posc++;
			}
			else
			{
				neg+=n;
				negc++;
			}
		}
		System.out.println((double)pos/posc);
		System.out.println((double)neg/negc);
	}

}
