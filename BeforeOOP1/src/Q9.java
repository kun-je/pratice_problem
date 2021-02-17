import java.util.Scanner;

public class Q9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int []x = new int[value];
		boolean count = false;
		for(int i = 0; i < x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		for(int i = 0;i < x.length-2;i++)
		{
			if(x[i+1] == x[i]+1 && x[i+2]== x[i+1]+1)
			{
				count = true;
				break;
			}
		}
		System.out.println(count);

	}

}
