
public class VectorTest
{

	public static void main(String[] args)
	{
		Vector a,b,c;
		a = new Vector();
		b = new Vector();
		a.x = 5;
		a.y = 6;
		b.x =7;
		b.y = 8;
		c = a.Add(b);
		System.out.println(c.x+" "+c.y);
	}

}
