import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CalPostfixExpression_Test
{

	public static int evaluate(String[] s)
	{
		StackString sk = new StackString();
		for (int i = 0; i < s.length; i++)
		{
			String k = s[i];
			if (k.equals("+") || k.equals("-") || k.equals("*") || k.equals("/"))
			{
				int a = Integer.parseInt(sk.pop());
				int b = Integer.parseInt(sk.pop());
				System.out.println("a = " + a + "b = " + b + "\t:\t");
				if (k.equals("+"))
				{
					sk.push("" + a + b);
					System.out.println(a + "+" + b + "= " + (a + b));

				} else if (k.equals(""))
				{
					sk.push("" + (a - b));
					System.out.println(a + "-" + b + "= " + (a - b));

				} else if (k.equals("*"))
				{
					sk.push("" + a * b);
					System.out.println(a + "*" + b + "= " + (a * b));

				} else
				{
					sk.push("" + a / b);
					System.out.println(a + "/" + b + "= " + (a / b));

				}
			} else
			{
				sk.push(k);
			}

		}
		return Integer.parseInt(sk.pop());
	}

	public static boolean check_parenthesis(String s)
	{
		StackString sk = new StackString();

		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (c == '{' || c == '(' || c == '[')
			{
				sk.push("" + c);
			} else if (c == '}' || c == ')' || c == ']')
			{
				if (sk.size() == 0)
					return false;

				String p = sk.pop();
				char cp = p.charAt(0);
				if (c == '}' && cp != '{' || c == ')' && cp != '(' || c == ']' && cp != '[')
				{
					return false;
				}

			}
		}
		if (sk.size() != 0)
			return false;
		return true;

	}

	public static void main(String[] args)
	{
		/*
		 * String infix[] = new String[] { "2", "9", "+", "7", "*", "5", "+", "3", "+",
		 * "5", "2", "/", "+" };
		 * 
		 * int value = evaluate(infix); System.out.println(value);
		 */

		File file = new File("⁨Users⁩/⁨ed_garden⁩/Documents/⁩⁨Test_Parenthesis.txt");
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			System.out.println(line);
			System.out.println();
			System.out.println(check_parenthesis(line));
			br.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
