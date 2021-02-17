import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Client1
{

	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("127.0.0.1",1234);//127.0.0.01 is our comp if we want another comp we need to change to their ip address
			Scanner sc2 = new Scanner(System.in);
			
			//output
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(sc2.nextLine());
			pw.flush();
			
			
			//input from client to server
			Scanner sc = new Scanner(socket.getInputStream()); 
			String s = sc.nextLine();
	
			System.out.println("MSG frome SERVER : " + s);
			
			
			
			socket.close();
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
