
public class BloodPressure
{
	public int sys;
	public int dia;
	
	public BloodPressure() {}
	
	public BloodPressure(int xsys, int xdia)
	{
		sys = xsys;
		dia = xdia;
	}
	
	public int getSys() {return sys;}
	public int getDia() {return dia;}
	
	
	public boolean isHigh()
	{
		if(getSys() > 140 && getDia() > 90)
		{
			return true;
		}
		return false;
	}

}
