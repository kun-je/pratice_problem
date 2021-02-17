
public class populationbetter
{

	public static void main(String[] args)
	{
		double n,a,b;
		a = 50e6;
		b = 70e6;
		n = Math.log(a/b)/Math.log(1.02/1.03);
		n = Math.ceil(n);
		System.out.println(n);
	}

}
