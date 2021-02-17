
public class Q8
{

	public static boolean tidyNumer(int n)
	{
		String s = ""+n;
		for(int i = 0; i < s.length()-1;i ++)
		{
			if(s.charAt(i) > s.charAt(i+1))
			{
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args)
	{
		System.out.print(tidyNumer(2335));
	}

}
