import java.util.Random;

public class EK2
{
	public static int random1(int b)
	{
		return new Random().nextInt(b+1);
	}
	
	public static int random2(int a,int b)
	{
		return (int)((Math.random()*(b-a+1))+ a);
	}
	
	public static int random3(int a, int b)
	{
		return (int)((Math.random()*(b-a))+ a) ;
	}
	

	public static void main(String[] args)
	{
		for(int i =0 ; i < 20;i++)
		{
			System.out.println(random3(5,10));
		}
	}

}
