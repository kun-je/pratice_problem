import java.util.Scanner;

public class EH7
{

	public static void main(String[] args)
	{
		int [][]a = new int[2][2];
		int [][]b = new int[2][2];
		int [][]c = new int[2][2];
		int [][]d = new int[2][2];
		Scanner sc = new Scanner(System.in);
		//initialize array a
		for(int i = 0;i <a.length;i++)
		{
			for(int j =0; j <a.length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		//initialize array b
		for(int i = 0;i <a.length;i++)
		{
			for(int j =0; j <a.length;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		//addition of array a and b to c
		for(int i = 0;i <a.length;i++)
		{
			for(int j =0; j <a.length;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		
		for(int i = 0; i < a.length;i++)
		{
			for(int j =0; j <a.length; j++)
			{
				d[i][j] = a[i][j] + b[j][i];
			}
		}

	}

}
