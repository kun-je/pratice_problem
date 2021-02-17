import java.util.Scanner;

public class E5_14
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int f = sc.nextInt();
		int sum = a+b+c+d+f;
		
		double avg =( (4.0*a)+(3.0*b)+(2.0*c)+d*1.0+f*0.0)/sum;
		System.out.println(avg);
		
		
	}

}
