
public class Q1
{

	public static void main(String[] args)
	{
		int n = 10;
		int [] x = new int[n];
		int [] y = new int[n];
		for(int i =0; i < x.length;i++)
		{
			x[i] = (int)(Math.random()*10);
			y[i] = (int)(Math.random()*10);
		}
		int sum = 0;
		
		for(int i = 0; i < x.length;i++)
		{
			sum += Math.pow(x[i]+y[i], 2);
		}
		System.out.println(sum);
	}

}
