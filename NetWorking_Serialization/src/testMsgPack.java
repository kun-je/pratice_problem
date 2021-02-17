import java.io.File;
import java.io.FileOutputStream;

public class testMsgPack
{

	public static void main(String[] args)
	{
		Person2 james = new Person2();
		
		james.id = 1;
		james.name = "James";
		james.surname = "sea-ngow";
		james.phone = "0853507540";
		
		MessagePack msgpack = new MessagePack();
		
		byte [] bytes = msgpack.write(james);
		System.out.println(bytes.length);
		
		FileOutputStream fileout = new FileOutputStream(new File("/Users/edgarden/Documents/James2.txt"));
		
		fileout.write(arg0);
		fileout.flush();
		fileout.close();
		
		
		Person2 dst = msgpack.read(bytes, Person2.class);
		System.out.println(dst.id);
		System.out.println(dst.name);
		System.out.println(dst.surname);
		System.out.println(dst.phone);

	}

}
