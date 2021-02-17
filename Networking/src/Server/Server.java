package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server
{
	ServerSocket xServerSocket;//real server
	MsgReceive reciever;
	ArrayList<ServerSideClient> list;

	public Server(	MsgReceive x_reciever)
	{
		reciever = x_reciever;
		list = new ArrayList<ServerSideClient>();
		try
		{
			xServerSocket = new ServerSocket(1234);
			//waiting for info
			Thread t = new Thread(new Runnable()
			{
				public void run()
				{
					while(true)
					{
						try
						{
							Socket socket = xServerSocket.accept();//get socket from  client
							ServerSideClient ssc = new ServerSideClient(socket, reciever);
							list.add(ssc);
						} catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			t.start();
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	//send to all client
	public void sendAll(String s)
	{
		for(ServerSideClient ss : list)
		{
			ss.send(s);
		}
	}
}
