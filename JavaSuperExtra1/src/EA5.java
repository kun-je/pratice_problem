import java.util.Scanner;

public class EA5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//if it is a triangle
		if(a+b> c&& a+c >b && b+ c > a )
		{
			System.out.println("It is a triangle");
			
			//what length type of triangle
			if(a==b && b==c)
			{
				System.out.println("It is a equliaterial");
			}
			else if(a==b || a==c || b==c)
			{
				System.out.println("It is a isoselice ");
			}
			else
			{
				System.out.println("It is a scalence");
			}
			
			//what angle triangle it is
			
			
		}
		else
		{
			System.out.println("It is not a triangle");

		}
	}

}
