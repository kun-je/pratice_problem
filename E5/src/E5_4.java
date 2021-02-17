import java.util.Scanner;

public class E5_4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input inches");
		double inch = sc.nextDouble();
		double ft = inch/12;
		double cm = inch*2.54;
		double yard = inch/36;
		System.out.println(ft);
		System.out.println(cm);
		System.out.println(yard);

	}

}
