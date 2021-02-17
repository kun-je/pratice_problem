import java.util.Random;
import java.util.Scanner;

public class EE12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []x = new int[n];
		int sum =0;
		for(int i = 0; i < x.length;i++)
		{
			x[i] = new Random().nextInt(1000);
		}
		int lowerindex = sc.nextInt();
		int upperindex = sc.nextInt();
		if(lowerindex < upperindex)
		{
			for(int i = 0; i <= upperindex; i++)
			{
				sum+=x[i];
			}
		}
		else
		{
			System.out.println("ERROR");
			return;
		}
		System.out.println(sum);
	}

}
