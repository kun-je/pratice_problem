import java.util.Scanner;

public class EF7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		String s10 = sc.nextLine();
		
		int[]cd = new int[9];
		int sum = 0;
		for(int i  = 0; i < 9; i++)
		{
			cd[i] = Character.getNumericValue(s10.charAt(i))*(i+1);
			sum = sum+cd[i];
		}
		sum = sum%11;
		if(sum == 10)
		{
			s10 = s10 +"x";
		}
		else
		{
			s10 = s10+sum;
 		}
		System.out.println(s10);
		
	}

}
