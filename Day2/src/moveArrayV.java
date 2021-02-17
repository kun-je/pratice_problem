import java.util.Arrays;
import java.util.Scanner;

public class moveArrayV
{

	public static void main(String[] args)
	{
		int []x = new int [10];
		Scanner sc = new Scanner(System.in);
		//get input
		for(int i = 0; i < x.length; i++)
		{
			System.out.println("Input");
			x[i]= sc.nextInt();
		}
		System.out.println("Input v");
		Scanner input = new Scanner(System.in);
		int v = input.nextInt();
		int index = -1;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i]== v)
			{
				index = i;
				break;
			}
		}
		if(index == -1)
		{
			return;
		}
		for(int i = index; i < x.length-1; i++)
		{
			x[i] = x[i+1];
		}
		x[x.length-1]= 0;
		System.out.println(Arrays.toString(x));
	}

}
