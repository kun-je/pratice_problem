import java.util.Arrays;
import java.util.Random;

public class EH2
{

	public static void main(String[] args)
	{
		int []a = new int[50];
		for(int i =0; i < a.length;i++)
		{
			 a[i] = new Random().nextInt(10);
		}
		System.out.println(Arrays.toString(a));
		for(int i =0 ; i< a.length;i +=2)
		{
			int t = a[i];
			a[i]=a[i+1];
			a[i+1]= t;
		}
		System.out.print(Arrays.toString(a));

	}

}
