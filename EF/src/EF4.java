import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EF4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int  y = sc.nextInt()-543;
		GregorianCalendar calendar = new GregorianCalendar();
	   calendar.set(Calendar.DAY_OF_MONTH, d);
	   calendar.set(Calendar.MONTH,m-1);
	   calendar.set(Calendar.YEAR, y);

		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR); 
		System.out.println(dayOfYear);
	}

}
