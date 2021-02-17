
public class EE14
{

	public static void main(String[] args)
	{
		for(double i =0; i <=3.14;i +=0.01)
		{
			double sin =Math.sin(i);
			double cos =Math.cos(i);
			double tan = Math.tan(i);
			System.out.printf("%.2f\t%.5f\t%.5f\t%.5f\n",i,sin,cos,tan);
		}
	}

}
