
public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList a = new MyArrayList();
		a.add(5);
		a.print();
		
		for(int i = 0; i < 10;i++)
		{
			a.add((int)(Math.random()*100));
		}
		//a.print();
		
		//System.out.println(a.get(2));
		System.out.println(a);
		a.set(2,0);
		System.out.println(a);

		

	}

}
