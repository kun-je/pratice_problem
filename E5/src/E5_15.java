import java.util.Scanner;

public class E5_15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input weight(kg) and height(cm)");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double m = Math.sqrt((w*h)/3600);
		double d = (71.84*Math.pow(w,0.425)*Math.pow(h, 0.725))/10000;
		double b = 0.0003207*Math.pow(h, 0.3)*Math.pow(1000*w, (0.7285-0.0188*(3+Math.log10(w))));
		System.out.println(m);
		System.out.println(d);
		System.out.println(b);

	}

}
