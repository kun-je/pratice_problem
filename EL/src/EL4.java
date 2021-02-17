import java.util.Arrays;

public class EL4
{

	public static double[][] transpose(double[][] d)
	{
		double [][] x = new double [d.length][d[0].length];
		for (int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d[0].length; j++)
			{
				x[i][j] = d[j][i];
			}
		}
		return x;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double[][] d =
		{
				{ 1, 4, 7 },
				{ 2, 5, 8 },
				{ 3, 6, 9 } };
		
		System.out.println(Arrays.deepToString(transpose(d)));

	}

}
