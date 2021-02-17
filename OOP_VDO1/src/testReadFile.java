import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testReadFile
{

	public static void main(String[] args)
	{
		File f = new File("/Users/edgarden/Documents/xxy.txt");
		Scanner sc = null;
		try
		{
			System.out.println("start read file");
			sc = new Scanner(f);
			while(sc.hasNext())
			{
				String s = sc.nextLine();
				System.out.println(s);
			}
			System.out.println("end read file");
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("this is error");
			e.printStackTrace();
		} 
		// have or not have error will do the finally
		finally
		{
			System.out.println("this is finally");
			if (sc != null)
			{
				sc.close();
			}
		}
	}

}
