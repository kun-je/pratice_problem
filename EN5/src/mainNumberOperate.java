import java.util.Scanner;

public class mainNumberOperate
{

	public static void main(String[] args)
	{
		int a, b;
		NumberOperate num = new NumberOperate();
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		num.setB(b);
		num.setA(a);
		

		System.out.println(num.add(num.getA(), num.getB()));
		System.out.println(num.subtract(num.getA(), num.getB()));
		System.out.println(num.multiply(num.getA(), num.getB()));
		System.out.println(num.divide(num.getA(), num.getB()));
		System.out.println(num.modulus(num.getA(), num.getB()));


	}

}
