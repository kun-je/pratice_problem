
public class X_test
{

	public static void main(String[] args)
	{
		X x = new X();
		System.out.println(x.hashCode());
		x.a =  5;
		System.out.println(x.hashCode());
	}

}
