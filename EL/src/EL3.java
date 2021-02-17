
public class EL3
{
	public static boolean isZero(double[] d)
	{
		for(int i = 0; i < d.length; i++)
		{
			if(d[i] != 0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean isIdentity(double [][] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++)
			{
				if(x[i][j] != 1 && i == j)
				{
					return false;
				}
				else if(x[i][j] != 0 && i!= j)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isLowerTriangular(double [][] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				if(x[i][j] != 0 && i < j)
				{
					return false;
				}
				else if(x[i][j] != 1 && i >= j)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isUpperTriangular(double [][] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				if(x[i][j] != 1 && i <= j)
				{
					return false;
				}
				else if(x[i][j] != 0 && i > j)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double [] d = {0,0,0,1,0,0};
		double[][] x =
		{
				{ 1, 1, 1 },
				{ 0, 1, 1 },
				{ 0, 0, 1 } };
		System.out.println(isZero(d));
		System.out.println(isIdentity(x));
		System.out.println(isLowerTriangular(x));
		System.out.println(isUpperTriangular(x));



	}

}
