
public class MarriageSelectionProblem
{

	public static void main(String[] args)
	{
		int n = 500;
		/*int x[] = new int[n];
		
		 * for(int i =1; i <= n;i++) { x[i] = i; } for(int i = 0; i < n*1000; i++) { int
		 * a = (int)(Math.random()*n); int b = (int)(Math.random()*n); int t = x[a];
		 * x[a] = x[b]; x[b] = t; }
		 */
		int i = 0;
		int k_max = 0;
		int count_max = 0;
		int []count = new int[n];
		for (int l = 1; l < 1000; l++)
		{
			int[] x = new int[n];
			for (i = 1; i <= n; i++)
			{
				x[i-1] = i;
			}
			for (i = 0; i < n * 100; i++)
			{
				int a = (int) (Math.random() * n);
				int b = (int) (Math.random() * n);
				int t = x[a];
				x[a] = x[b];
				x[b] = t;
			}
			for(int k = 1; k < n; k ++)
			{
				int max = 0;
				for( i = 0; i < k; i++)
				{
					if(x[i]> max)
					{
						max = x[i];
					}
				}
				for(;i< n;i++)
				{
					if(x[i]>max)
					{
						if(x[i] == n)
						{
							count[k]++;
						}
						break;
					}
				}
				
			}
		}
		for(i = 0; i < n;i++)
		{
			if(count_max < count[i])
			{
				count_max = count[i];
				k_max = i;
			}
		}
		System.out.println(k_max);

	}

}
