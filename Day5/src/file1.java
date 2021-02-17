import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class file1
{

	public static void main(String[] args)
	{
		File f = new File("/Users/edgarden/Documents/XXX.txt");
		//appendไม่ทับอันเดิม
		FileOutputStream outs;
		PrintWriter	pw = null;
		try
		{
		outs = new FileOutputStream(f,true);
		pw = new PrintWriter(outs);
		pw.println("Hello");
		pw.close();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		
	}

}
