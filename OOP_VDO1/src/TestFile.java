import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFile
{

	public static void main(String[] args)
	{
		File f = new File("/Users/edgarden/Documents/xxy.txt");
		try
		{
			//FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(f);
			pw.println("Hello");
			pw.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
