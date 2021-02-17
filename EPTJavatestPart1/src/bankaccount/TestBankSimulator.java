package bankaccount;

import java.util.Scanner;

public class TestBankSimulator
{
	public static int printMenu(Scanner sc)
	{
		System.out.println("==========MENU===========");
		System.out.println("PLEASE SELECT YOUR OPTION");
		System.out.println("1. DEPOSITE");
		System.out.println("2. WIDTHDRAW");
		System.out.println("3. CHECK BALANCE");
		System.out.println("4. EXIT");

		int i = sc.nextInt();
		while (i <= 0 || i > 4)
		{
			System.out.println("==========MENU===========");
			System.out.println("PLEASE SELECT YOUR OPTION");
			System.out.println("1. DEPOSITE");
			System.out.println("2. WIDTHDRAW");
			System.out.println("3. CHECK BALANCE");
			System.out.println("4. EXIT");
			i = sc.nextInt();
		}

		return i;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BankSimulator sim = new BankSimulator();
		int input = printMenu(sc);
		while (true)
		{
			if (input == 1)
			{
				System.out.println("Please input acc_no :");
				int acc_no = sc.nextInt();
				System.out.println("Please input amount to deposite :");
				double amount = sc.nextDouble();
				sim.deposit(acc_no, amount);
			} else if (input == 2)
			{
				System.out.println("Please input acc_no :");
				int acc_no = sc.nextInt();sc.nextLine();
				System.out.println("Please input password :");
				String password = sc.nextLine();
				System.out.println("Please input amount to widthdraw :");
				double amount = sc.nextDouble();
				sim.widthdraw(acc_no, password, amount);
			} else if (input == 3)
			{
				System.out.println("Please input acc_no :");
				int acc_no = sc.nextInt();sc.nextLine();
				System.out.println("Please input password :");
				String password = sc.nextLine();
				sim.getBalance(acc_no, password);
			}
			else
			{
				return;
			}
			input = printMenu(sc);
			
		}

	}

}
