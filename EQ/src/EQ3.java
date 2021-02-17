
public class EQ3 {

	public static void main(String[] args) 
	{
		Point p1 = new Point(5,3);
		Point p2 = new Point(10,5);
		System.out.println(p2.distance(p1));
		System.out.println(p2.getQuadrant());
		System.out.println(p1.equals(p2));
	}

}
