import java.util.Scanner;

public class EC1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int [10];
		int count = 0;
		for(int i = 0; i <x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i <x.length;i++)
		{
			if(x[i]>= 10)
			{
				count ++;
			}
		}
		System.out.println(count);
	}

}
