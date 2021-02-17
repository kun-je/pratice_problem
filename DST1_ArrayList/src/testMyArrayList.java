
public class testMyArrayList
{

	public static void main(String[] args)
	{
		MyArrayList a = new MyArrayList(10);
		
		for(int i = 0; i<10;i++)
		{
			a.add((int)(Math.random()*10));
		}
		a.toArray();
		a.print();
		//System.out.println(a.containsDup());
		//a.clear();
		//a.removeAll(5);
		System.out.println(a.mode());
		a.print();
	}

	
}
