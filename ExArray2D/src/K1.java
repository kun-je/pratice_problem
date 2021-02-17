import java.util.Scanner;

public class K1
{

	public static void main(String[] args)
	{
		int [][] A = new int [3][3];
		int [][] B = new int [3][3];
		int [][] C = new int [3][3];
		int [][] D = new int [3][3];

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < A.length; i++)
		{
			for(int j = 0 ; j < A[0].length; j++)
			{
				A[i][j]= sc.nextInt();
			}	
		}
		for(int i = 0; i < B.length; i++)//B.length คือขนาดของมิติแรก
		{
			for(int j = 0 ; j < B[0].length; j++)//B[0].lengthคือขนาดของมิติที่สอง
			{
				B[i][j]= sc.nextInt();
			}	
		}
		//add matrix
		for(int i = 0; i < A.length; i++)
		{
			for(int j = 0 ; j < A[0].length; j++)
			{
				C[i][j]= A[i][j] + B[i][j];
			}
		}
		for(int i = 0; i < A.length; i++)
		{
			for(int j = 0 ; j < A[0].length; j++)
			{
				System.out.print(C[i][j]+ "\t");
			}
			System.out.println();
		}
		//multiply matrix
		for(int i = 0; i < B.length; i++)
		{
			for(int j = 0; j< B[0].length; j++)
			{
				int sum = 0;
				for(int k = 0; k < B.length; k++)
				{
					sum += A[i][k]*B[i][k];
				}
				D[i][j]= sum;
				
			}
		}
		for(int i = 0; i < B.length; i++)
		{
			for(int j = 0 ; j < B[0].length; j++)
			{
				System.out.print(D[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
