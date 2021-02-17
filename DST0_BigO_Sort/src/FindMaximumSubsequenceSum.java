
public class FindMaximumSubsequenceSum {

	public static int mss1(int[] a) {
		int max = 0;
		// first loop n times
		for (int i = 0; i < a.length; i++) {
			// second loop depend on a
			for (int j = 1; j < a.length; j++) {
				int sum = 0;
				// this loop is big O
				for (int k = i; k <= j; k++) {
					sum = sum + a[k];
				}
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static int mss2(int[] a) 
	{
		int max = 0;
		for (int i = 0; i < a.length; i++) 
		{
			int sum = 0;
			for (int j = i; j < a.length; j++) 
			{
				sum =sum+ a[i];
				if (sum > max) max = sum;
			}
		}
		return max;
	}
	
	public static int mss3(int[] a) 
	{
		int max = 0;
		int sum = 0;

		for (int i = 0; i < a.length; i++) 
		{
			sum = sum +a[i];
			if(sum < 0)
			{
				sum = 0;
			}
			if(sum >max)
			{
				max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 1, 7, -10, 8, 2, 5, 10, -7, 2, -3, 19, -25 };
		
		System.out.println(mss1(a));
		System.out.println(mss2(a));
		System.out.println(mss3(a));
		
		int n = 1000;
		int [] b = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			b[i] = (int)(Math.random()*n - n/2);
		}
		long x1,x2;
		x1 = System.currentTimeMillis();
		int m = mss1(b);
		x2 = System.currentTimeMillis();
		System.out.println("Maximum subsequence sum : " +m+ " , BigO = 0(n^3) =  " + (x2-x1)+ " milliseconds");
		
		x1 = System.currentTimeMillis();
		m = mss2(b);
		x2 = System.currentTimeMillis();
		System.out.println("Maximum subsequence sum : " +m+ " , BigO = 0(n^2) =  " + (x2-x1)+ " milliseconds");
		
		x1 = System.currentTimeMillis();
		m = mss3(b);
		x2 = System.currentTimeMillis();
		System.out.println("Maximum subsequence sum : " +m+ " , BigO = 0(n^1) =  " + (x2-x1)+ " milliseconds");





	}

}
