import java.util.Scanner;

public class EH6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][]x = new int[2][3];
		//input information
		for(int i = 0; i<x.length;i++)
		{
			for(int j = 0;j< x[0].length;j++)
			{
				x[i][j] = sc.nextInt();
			}
		}
		
		//making table
		System.out.println("\t\t|\tMonth1 \t|\tMonth2 \t|\tMonth3 \t|");
		for(int i = 0; i<x.length;i++)
		{
			System.out.print("info of obj " +(i+1)+"\t\t");
			for(int j = 0;j< x[0].length;j++)
			{
				System.out.print(x[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.print("sum\t\t\t");
		//calculating total sum
		int total_sum = 0;
		for(int i =0; i <x[0].length; i++)
		{
			int sum = 0;
			for(int j = 0; j <x.length;j++)
			{
				sum += x[j][i];
			}
			System.out.print(sum+"\t\t");
			total_sum +=sum;
		}
		System.out.print(total_sum+"\t\t");

		
	}

}
