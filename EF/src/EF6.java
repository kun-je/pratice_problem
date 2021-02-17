import java.util.Scanner;

public class EF6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		String s10 = sc.nextLine();
		String s13 = "";
		char nine = 9;
		s13 = "" +978;
		for(int i = 0; i < 9;i++)
		{
			s13 = s13 +s10.charAt(i);
		
		}
		int[]even = new int[6];
		int []odd = new int[6];
		int sum = 0;
		for(int i  = 0 ; i < 6; i++)
		{
			even[i] = Character.getNumericValue(s13.charAt(2*i));
			odd[i] = Character.getNumericValue(s13.charAt(2*i+1))*3;
			sum = sum + even[i]+odd[i];
		}
		sum = sum%10;
		if(sum == 0)
		{
			s13 = s13+"0";
		}
		else
		{
			sum = 10- sum;
			s13 = s13 + ""+sum;
		}
		System.out.println(s13);
		
	}

}
