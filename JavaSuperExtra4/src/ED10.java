import java.util.Scanner;

public class ED10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][]x = new int[5][7];
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x[0].length; j++)
			{
				x[i][j] = sc.nextInt();
			}
			//System.out.println();
		}
		for(int i = 0; i < x.length; i++)
		{
			int sum = 0;
			for(int j = 0; j <x[0].length; j++)
			{
				sum += x[i][j];
			}
			System.out.println(sum);
		}
	}

}
