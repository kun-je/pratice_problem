import java.math.BigInteger;

public class EQ1 {

	
	public static BigInteger fibonaci()
	{
		BigInteger f = new BigInteger("1");
		BigInteger s = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		BigInteger temp = new BigInteger("0");

		for(int i = 3; i < 200 ;i++)
		{
			temp = f;
			f = f.add(s);
			s = temp;
		}
		sum = f.add(s);
		return  sum;
	}

	public static void main(String args[]) throws Exception {
		System.out.println(fibonaci());
	}

}
