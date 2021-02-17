import org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;

public class CharProblemTest
{

	public static void main(String[] args)
	{
		CharProblem age = new CharProblem();
		/*Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String s = sc.nextLine();*/
	
	}
	@Test
	public  void test1()
	{
		assertEquals(5,CharProblem.howOld("5 years old"));
	}
	
	@Test
	public  void test2()
	{
		assertEquals(9,CharProblem.howOld("9 years old"));
	}
	
	@Test
	public  void test3()
	{
		assertEquals(3,CharProblem.howOld("3 years old"));
	}

}
