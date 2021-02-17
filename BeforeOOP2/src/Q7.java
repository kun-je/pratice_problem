
public class Q7
{

	public static int new_avg(int[] arr,int navg)
	{
		int sum = 0;
		for(int i = 0; i < arr.length;i++)
		{
			sum+= arr[i];
		}
		double n = (double)(navg*(arr.length+1))-sum;
		if(n < 0)
		{
			throw new IllegalArgumentException("number less than zero");
		}
		return (int)n;
	}
	public static void main(String[] args)
	{
		int a[] ={14,30,5,7,9,11,15};
		int avg = 92;
		System.out.println(new_avg(a,avg));
	}

}
