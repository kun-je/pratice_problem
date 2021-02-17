
public class Point 
{
	private double x,y;
	
	public Point() {}
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p)
	{
		this.x = p.x;
		this.y = p.y;
	}
	
	public double getx() {return x;}
	
	public double gety() {return y;}
	
	public void setx(double x)
	{
		this.x =x;
	}
	
	public void sety(double y)
	{
		this.y = y;
	}
	
	public double distance(Point p)
	{
		return Math.sqrt(Math.pow(x-p.x, 2)-Math.pow(y-p.y,2));
	}
	
	public int getQuadrant()
	{
		if(x>= 0 && y >= 0)
		{
			return 1;
		}
		else if(x<0 && y >0)
		{
			return 2;
		}
		else if(x<0 && y <0)
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}
	
	public boolean equals(Point p)
	{
		return x == p.x && y == p.y;
	}
	
	public String toString()
	{
		return "(" +x+","+y+")";
	}

}