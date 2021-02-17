import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EK3
{

	public static void isPrime(int n)
	{
		for(int i = 2; i < n ;i++)
		{
			if(n%i == 0)
			{
				System.out.println("NOT PRIME");
				return;
			}
		}
		System.out.println("PRIME");

		
	}
	
	public static void dayOfWeek(int d, int m, int y) throws ParseException
	{
		String yourdate = d+"/"+m+"/"+y;
		  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		  Date dt1= format1.parse(yourdate);
		  DateFormat format2=new SimpleDateFormat("EEEE"); 
		  String finalDay=format2.format(dt1);
		  System.out.println(finalDay);
	}
	
	public static void rot13(String text)
	{
		char[] word = text.toCharArray();
		for(int i = 0; i < word.length; i++)
		{
			if( word[i] <= 90 && word[i] >= 65)
			{
				if(word[i] > 'M')
				{
					word[i] -= 13;
				}
				else
				{
					word[i] +=13;
				}
			
			}
			else if(word[i] <= 122 && word[i] >= 97)
			{
				if(word[i] > 'm')
				{
					word[i] -= 13;
				}
				else
				{
					word[i] += 13;
				}
			}
			
		}
		System.out.println(word);
	}
	
	public static void ean13(String code)
	{
		char[] barcode = code.toCharArray();
		if(barcode.length != 13)
		{
			System.out.println("Not ean13");
		}
		else
		{
			int even = 0;
			int odd = 0;
			int sum = 0;
			for(int i = 0; i < barcode.length - 1;i++)
			{
				if(barcode[i]%2 == 0)
				{
					even += barcode[i];
				}
				else
				{
					odd += barcode[i];
				}
				even = even / 3;
				sum = even + odd;
				sum = sum %10;
				/*if(sum != 0)
				{
					sum = sum - 10;
				}*/
			}
			String sums = Integer.toString(sum);
			String lastDigit = Character.toString(barcode[12]);
			if(lastDigit.equals(sums))
			{
				System.out.println("is ean 13");
			}
			else
			{
				System.out.println("is not ean 13");

			}
			System.out.println(lastDigit);
			System.out.println(sums);

		}

		
	}
	
	
	public static void main(String[] args) throws ParseException
	{
		isPrime(12);
		dayOfWeek(27,07,2019);
		rot13("HEllo There!");
		ean13("9786162002779");
	}

}
