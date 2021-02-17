
public class factorialmethod
{
	public static int fac(int n)
	{
		int result = 1;
		for(int i = 1; i <= n ; i++)
		{
			result*=i;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int num = 4;
		int ans = fac(num);
		System.out.println(ans);
	}

}
