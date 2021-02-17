import java.util.Scanner;

public class E5_6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input 3 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a+b+c;
		double avg  = sum/3.0;
		System.out.println(sum);
		System.out.println(avg);

	}

}
