import java.util.Scanner;

public class S1
{

	public static void main(String[] args)
	{
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		if(s1.indexOf(s2)== -1)
		{
			System.out.println("doesn't have");
			return;
		}
		int i = 0;
		while(i >= 0 && i < s1.length())
		{
			i =  s1.indexOf(s2, i);
			if(i==-1) break;
			System.out.println(i);
			i++;
		}
		
	}

}
