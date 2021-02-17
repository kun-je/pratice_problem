import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Server1
{

	public static void main(String[] args)
	{
		try
		{
			//create a server
			ServerSocket ss = new ServerSocket(1234);
			System.out.println("start sever ...");
			Socket socket = ss.accept();//wait for client
			
			//input from client to server
			Scanner sc = new Scanner(socket.getInputStream()); 
			String s = sc.nextLine();
			Calendar now = Calendar.getInstance();
			SimpleDateFormat format1 = new SimpleDateFormat("HH-MM-SS");
			s = s.toUpperCase() +"    "+ format1.format(now.getTime());
			
			//output
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(s);
			pw.flush();//make it really senting
			
			ss.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
