
public class NumberOperate 
{
	private int  a;
	private int  b;
	
	public NumberOperate()
	{

	}
	public void setA(int a)
	{
		this.a = a;
	}
	
	public void setB(int b)
	{
		this.b = b;
	}
	
	
	public int getA()
	{
		return a;
	}
	
	
	public int getB()
	{
		return b;
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int subtract(int a, int b)
	{
		return a-b;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public double divide(int a, int b)
	{
		return (double)a/b;
	}
	
	

}
