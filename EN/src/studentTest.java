import java.util.Scanner;

public class studentTest
{

	public static void main(String[] args)
	{
		int pass, sc;
		String n, sur;
		Scanner input = new Scanner(System.in);
		pass = input.nextInt();
		sc = input.nextInt();
		String i = input.nextLine();
		n = input.nextLine();
		sur = input.nextLine();
		Student person1 = new Student(pass,sc,n,sur);
		person1.gradeCal(sc);
		System.out.println(person1.toString());
	}

}
