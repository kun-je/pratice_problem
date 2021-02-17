import java.util.Scanner;

public class EA4212
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input weight of the product");
		double w = sc.nextDouble();
		int p = 0;
		if(w > 3)
		{
			p = 100;
		}
		else if(w>2.1)
		{
			p = 70;
		}
		else if(w>1.1)
		{
			p = 60;
		}
		else
		{
			p =50;
		}
		System.out.println(p);
	}

}
