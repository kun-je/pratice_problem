import java.text.DecimalFormat;

public class EE6
{

	public static void main(String[] args)
	{
		DecimalFormat numberFormat = new DecimalFormat("#.000000");
		String pi2 = "";
		double sum = 0;
		int n = 3000000;
		int count =1;
		double k ;
		for(int i = 1 ; i <= n; i++)
		{
			sum = sum/4;
			k =  2*i -1;
			sum += 1.0/k;
			i++;
			k = 2*i -1;
			sum -= 1.0/k;
			count+=2;
			sum = sum*4;
			pi2 = numberFormat.format(sum);
			if(pi2.equals("3.141592"))
			{
				break;
			}
		}
		System.out.println(count);
		System.out.print(pi2);




	}

}
