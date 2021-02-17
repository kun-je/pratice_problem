import java.util.Scanner;

public class EH2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		double i1 = i;
		double r = sc.nextDouble();
		r = (r/100)+1;
		double p = 0;
		for(int n =0; n < 10;n++)
		{
			p = i*r;
			i = p +i1;
		}
		System.out.print(p);

		
	}

}
