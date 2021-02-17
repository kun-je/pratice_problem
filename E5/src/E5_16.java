import java.util.Scanner;

public class E5_16
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input second");
		int sec = sc.nextInt();
		int y = sec/31104000;
		sec = sec - (y*31104000);
		int m = sec/2592000;
		sec = sec - (m*2592000);
		int d = sec/ 86400;
		sec = sec -(d*86400);
		int h = sec/3600;
		sec = sec -(h*3600);
		int min = sec/60;
		sec = sec -(min*60);
		System.out.println(y);
		System.out.println(m);

		System.out.println(d);

		System.out.println(h);

		System.out.println(min);

		System.out.println(sec);

	}

}
