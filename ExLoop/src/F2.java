import java.util.Scanner;

public class F2
{

	public static void main(String[] args)
	{
		//System.out.println("PLease input");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k =1;
		int count = 0;
		while(k <= a)
		{
			if(a%k == 0)
			{
				count ++;
			}
			k++;
		}
		System.out.println(count);
	}

}