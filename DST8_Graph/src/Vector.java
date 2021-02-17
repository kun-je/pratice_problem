//vector is postion and movement of the ball
public class Vector
{
	double x,y;
	//constructor คือmethodที่ชื่อเหมือนclass จะถูกเรียกครั้งแรก ครั้งเดียวตอนnew object 
	//จาก class constructor จะไม่มีreturn type
	public Vector()
	{
		x = 0;
		y = 0;
	}
	
	public Vector(double x, double y)
	{
		//เพราะชื่อของ parameter มันซ้ำกับ field
		this.x = x;
		this.y = y;
	}
	
	public Vector(Vector v)
	{
		x = v.x;
		y= v.y;
	}
	
	public Vector add(Vector v)
	{
		Vector result = new Vector();// new = สร้าง
		result.x = this.x+v.x;
		result.y = this.y+v.y;
		return result;
	}
	
	public String toString()
	{
		return "("+x+","+y+ ")";
	}
	
	public Vector sub(Vector v)
	{
		Vector result = new Vector();// new = สร้าง
		result.x = this.x-v.x;
		result.y = this.y-v.y;
		return result;
	}
	
	public Vector mul(double m)
	{
		Vector result = new Vector();// new = สร้าง
		result.x = this.x*m;
		result.y = this.y*m;
		return result;
	}
	
	public double dot(Vector v)
	{
		double result =this.x*v.x + this.y*v.y;
		return result;
	}
	
	public double size()
	{
		double result = Math.sqrt(x*x + y*y);
		return result;
	}
	
	public Vector unit()
	{
		double s = size();
		return new Vector(x/s,y/s);
	}
	
	/*public static void main(String args[])
	{
		Vector a = new Vector();
		a.x = 3;
		a.y = 4;
		Vector b = new Vector(5,7);
		Vector c;
		c = a.add(b);
		System.out.println(c.x+" "+c.y);
		System.out.println(c);

		System.out.println(a.dot(b));
		System.out.println(a.size());
		System.out.println(a.unit());
		
	}*/
}
