import java.util.Scanner;

public class EA421
{
	public static void main(String[] args)
	{
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter i,j,k");
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		if(i%j == 0)
		{
			k = i*2;
		}
		else if(i*4 == j)
		{
			k = i/2;
		}
		else if((i == 0 && j != 0) || (i != 0 && j == 0))
		{
			if(i == 0 && j != 0)
			{
				i = j;
			}
			else if(i != 0 && j == 0)
			{
				j = i;
			}
		}
		else if(i % 2 != 0 && i > j)
		{
			i++;
			j++;
		}
		else if(i>= 0 && i < 20 && i != 8 && i != 10)
		{
			if(i < 10)
				k = k+2;
			else
				k = k/2;
		}
		
	}

}
