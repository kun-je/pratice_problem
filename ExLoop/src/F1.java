import java.util.Scanner;

public class F1
{

	public static void main(String[] args)
	{
		//System.out.println("PLease input");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k =1;
		while(k <= a)
		{
			if(a%k == 0)
			{
				System.out.println(k);
			}
			k++;
		}
	}

}
