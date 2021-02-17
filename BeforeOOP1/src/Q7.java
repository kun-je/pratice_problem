import java.util.Scanner;

public class Q7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int []x = new int[value];
		boolean count = true;
		for(int i = 0; i < x.length; i++)
		{
			x[i]= sc.nextInt();
		}
		int num = sc.nextInt();
		for(int i =0; i < x.length-1; i++)
		{
			if(x[i] == num || x[i+1]== num)
			{
			}
			else
			{
				count = false;
			}
		}
		System.out.print(count);
	}

}
