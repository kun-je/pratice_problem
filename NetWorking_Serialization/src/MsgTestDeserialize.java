import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MsgTestDeserialize
{

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream fin = new FileInputStream(new File(".../james2.txt"));
		MessagePack msg = new MessagePack();
		Person2 p2 = msg.read(fin, Person2.class);
		fin.close();
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.surname);
		System.out.println(p2.phone);


	}

}
