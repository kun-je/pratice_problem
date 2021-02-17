import java.util.Scanner;

public class S3
{

	public static void main(String[] args)
	{
		String s1;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		boolean isPalin = true;
		for(int i = 0; i < s1.length()/2; i++)
		{
			if(s1.charAt(i) == s1.charAt(s1.length()-1-i))
			{
			}
			else
			{
				isPalin = false;
				break;
			}
		}
		String result = isPalin ? "Yes": "No";
		System.out.println(result);
		
	}

}
