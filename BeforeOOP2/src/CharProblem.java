
public class CharProblem
{
	public String name;
	
	public CharProblem()
	{
	}
	
	public int howOld(String ans)
	{
		
		char age = ans.charAt(0);
		int a = Character.getNumericValue(age);
		return a;
	}
	
}
