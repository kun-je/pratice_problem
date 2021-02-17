import java.util.Scanner;

public class E5_9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input width and height");
		double w = sc.nextDouble();
		double h  = sc.nextDouble();
		double area = w*h;
		double param = w*2 + h*2;
		System.out.println(area);
		System.out.println(param);

	}
	

}
