import java.util.Scanner;

public class EC11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		int count = 1000;
		for(int i =0; i < 4; i++)
		{
			s += n/count%10 + ", ";
			count /= 10;
		}
		s = s.substring(0,s.lastIndexOf(" ")).trim();
		System.out.println("["+s.substring(0,s.lastIndexOf(",")).trim()+"]");
	}

}
