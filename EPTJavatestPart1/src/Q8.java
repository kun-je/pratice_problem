import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Q8
{
	public static void main(String[] args)
	{
		Scanner sc;
		try
		{
			URL rss = new URL("https://feeds.foxnews.com/foxnews/latest");
			BufferedReader ins = new BufferedReader(new InputStreamReader(rss.openStream()));
			sc = new Scanner(ins);
			while (sc.hasNext())
			{
				String s = sc.nextLine();
				int c = s.indexOf("<item>");
				if (c == -1)
				{
					continue;
				}
				int a = s.indexOf("<title");
				if (a == -1)
				{
					continue;
				}
				int b = s.indexOf("</tilte>");
				if (b == -1)
				{
					continue;
				}
				String s2 = s.substring(a + 7, b);
				System.out.println(s2);
				sc.close();
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
