import java.util.Scanner;

public class EE13
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []x = new int[n];
		double []avg = new double[n];
		double []avgAll = new double[5];
		for(int i =0; i < x.length;i++)
		{
			x[i] = 0;
		}
		//by person
		for(int i  =0; i < n;i++)
		{
			//each time test
			for(int j =0; j < 5;j++)
			{
				int score = sc.nextInt();
				x[i] += score;
				avgAll[j] += score;
			}
		}
		
		
		for(int i = 0; i < n; i++)
		{
			avg[i]= x[i]/5.0;
			System.out.println(avg[i]);
			//avgAll += avg[i];
		}
		//System.out.println(avgAll/n);
		for(int j =0; j < 5;j++)
		{
			System.out.println(avgAll[j]/n);
		}
	}

}
