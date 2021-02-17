import java.util.Scanner;

public class H1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int[10];
		for(int i = 0 ; i < x.length; i++)
		{
			//System.out.println("Please input a number");
			x[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] % 2  == 0)
			{
				count++;
				break;
			}
		}
		if(count != 0)
		{
			System.out.println("have");
		}
		else
		{
			System.out.println("don't have");	
		}
		
	}

}
