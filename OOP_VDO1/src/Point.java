
public class Point
{

		public double x,y;
		public Point()
		{
			
		}
		public Point(double x, double y)
		{
			this.x = x;
			this.y = y;
		}
		
		public String toString()
		{
			return String.format("(%f, %f)", x,y);
		}
		
		public boolean equals(Object o)
		{
			if(o instanceof Point)
			{
				Point pp =(Point)o;
				return pp.x == x && pp.y == y;
			}
			else
			{
				return false;
			}
		}
}
