import java.util.Arrays;
import java.util.Scanner;

public class EH14
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int []x = new int [3];
		int mid = 0;
		for(int i =0; i < 3;i++)
		{
			n = sc.nextInt();
			x[i] = n;
			if(max< n)
			{
				max = n;
			}
			if(min > n)
			{
				min = n;
			}


		}
		for(int i = 0; i < 3 ; i++)
		{
			if(x[i] != max && x[i]!= min)
			{
				mid = x[i];
			}	
		}
		System.out.println(max);
		System.out.println(min);
		x[0]=min;
		x[1] = mid;
		x[2] = max;
		System.out.println(Arrays.toString(x));


	}

}
