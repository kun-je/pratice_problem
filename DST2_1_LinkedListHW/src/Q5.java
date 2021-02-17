import java.util.Scanner;

public class Q5
{

	public static void main(String[] args)
	{
		SinglyLinkedList s = new SinglyLinkedList();

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int index = 0;
		while (true)
		{
			if (input.equals("a"))
			{
				System.out.println("!");
				for (int i = 0; i < 10; i++)
				{
					int n = sc.nextInt();
					s.addFirst(n);
				}

			} else if (input.equals("s"))
			{
				System.out.println("!!");

				index = sc.nextInt();
				System.out.println(s.get(index));
			} else if (input.equals("f"))
			{

			} else if (input.equals("b"))
			{

			} else if (input.equals("d"))
			{
				index = sc.nextInt();
				s.removeAt(index);
			} else if (input.equals("i"))
			{

			} else if (input.equals("q"))
			{
				System.exit(0);
			}
			sc.nextLine();
			input = sc.nextLine();
			System.out.println("!!!");

		}
	}

}
