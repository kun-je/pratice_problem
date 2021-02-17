
public class Vector
{
	double x, y;
	public Vector Add(Vector v)
	{
		Vector result = new Vector();
		result.x = x + v.x;
		result.y = y + v.y;
		return result;
	}
}