import java.util.Scanner;

public class Q4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.charAt(0)=='f' && s.charAt(s.length()-1)== 'b')
		{
			System.out.println("FizzBuzz");
		}
		else if(s.charAt(0)=='f')
		{
			System.out.println("Fizz");
		}
		else if(s.charAt(s.length()-1)== 'b')
		{
			System.out.println("Buzz");
		}
		else
		{
			System.out.println(s);
		}
	}

}
