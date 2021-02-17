package Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;



public class ServerSideClient
{
	Socket xSocket;
	Scanner scanner ;
	PrintWriter printwriter;
	MsgReceive reciever;
	
	
	public ServerSideClient(Socket x_Socket,MsgReceive x_reciever)
	{
		//sending
		xSocket = x_Socket;
		reciever = x_reciever;
		try
		{
			scanner = new Scanner(xSocket.getInputStream());
			printwriter = new PrintWriter(xSocket.getOutputStream());

		} catch (IOException e)
		{
			e.printStackTrace();
		}
		//waiting for info
		Thread t = new Thread(new Runnable()
		{
			public void run()
			{
				while(true)//waiting for text from another side of the comp
				{
					String s = scanner.nextLine();//things that we recieve
					reciever.getMsg(s);
				}
			}
		});
		t.start();
	}
	
	//senting info
	public void send(String s)
	{
		printwriter.println(s);
		printwriter.flush();
	}
	
	

}
