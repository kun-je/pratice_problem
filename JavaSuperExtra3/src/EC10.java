import java.util.Arrays;
import java.util.Scanner;

public class EC10
{

	public static void main(String[] args)
	{
	  	Scanner sc = new Scanner(System.in);
	  	int n = sc.nextInt();
	  	int []x = new int[n];
	  	for(int i = 0; i < x.length;i++)
	  	{
	  		x[i] = sc.nextInt();
	  	}
	  	if(n%2==0)
	  	{
	  		int []a = new int[n/2];
	  		int back = x.length-1;
	  		for(int i =0; i < a.length; i++)
	  		{
	  			a[i]= x[i]+x[back];
	  			back--;
	  		}
		  	System.out.println(Arrays.toString(a));

	  	}
	  	else
	  	{
	  		int []a = new int[(n+1)/2];
	  		int back = x.length-1;
	  		for(int i =0; i < a.length; i++)
	  		{
	  			a[i]= x[i]+x[back];
	  			back--;
	  		}
		  	System.out.println(Arrays.toString(a));

	  	}
	}

}
