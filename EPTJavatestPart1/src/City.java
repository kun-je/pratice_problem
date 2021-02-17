
public class City
{
	public String Country,City,AccentCity, Region;
	long Population;
	double Longtitude,Latitude;
	
	public String toString()
	{
		return String.format("%s\t%s\t%s\t%s\t%d\t%f\t%f", Country,City,AccentCity, Region,Population,Longtitude,Latitude);
	}
}
