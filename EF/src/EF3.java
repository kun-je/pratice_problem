import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EF3
{

	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int h ;
		int min;
		h = h2 - h1;
		if(h < 0)
		{
			h = 12+h;
		}
		min = m2 - m1;
		if(min < 0)
		{
			h--;
			min = 60- Math.abs(min);
		}
		System.out.println(h);
		System.out.println(min);



	}

}
