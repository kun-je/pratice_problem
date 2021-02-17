import java.util.Scanner;

public class EC5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int total_sales = 0;
		double com = 0;
		while(true )
		{
			//System.out.println("Please input total sales");
			total_sales = sc.nextInt();
			if(total_sales < 0)
			{
				System.out.println("exit");
				break;
			}
			else if(total_sales < 10000)
			{
				com = 0;
			}
			else if(total_sales >= 10000 && total_sales < 25000)
			{
				com = total_sales * 0.07;
			}
			else
			{
				com =total_sales * 0.1;
			}
			System.out.println(com);

		}
		
	}

}
