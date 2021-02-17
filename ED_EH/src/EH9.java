import java.util.Scanner;

public class EH9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double n  = 0;
		double sum= 0;
		//double avg = 0;
		for(int i =0; i < 5 ;i++)
		{
			n = sc.nextDouble();
			sum += n;
		}
		System.out.println(sum);
		System.out.println(sum/5);
	}

}
