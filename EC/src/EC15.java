import java.util.Scanner;

public class EC15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int num = a*d+c*b;
		int dnum = b*d;
		int k = num;
		while(num%k != 0 || dnum%k != 0)
		{
			k--;
		}
		//System.out.println(k);
		int num2 =num/k;
		int dnum2 =dnum/k;
		System.out.println(num +"/"+dnum);
		System.out.println(num2 +"/"+dnum2);
	}

}
