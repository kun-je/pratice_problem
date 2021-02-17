import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CityOnSphere
{
	public static City parse(String line)
	{
		City city = new City();
		String []ss = line.split(",");
		city.Country = ss[0];
		city.City = ss[1];
		city.AccentCity = ss[2];
		city.Region = ss[3];
		if(ss[4]=="")
		{
		city.Population = Long.parseLong(ss[4]);
		}
		city.Latitude = Double.parseDouble(ss[5]);
		city.Longtitude = Double.parseDouble(ss[6]);
		return city;
	}
	
	public static double getDistance(City city1, City city2)
	{
		double theta1,theta2,lamda1,lamda2;
		theta1 = city1.Latitude/180 *Math.PI;
		theta2 = city2.Latitude/180 *Math.PI;
		lamda1 = city1.Longtitude/180 *Math.PI;
		lamda2 = city1.Longtitude/180 *Math.PI;
		
		double delta_theta = theta2-theta1;
		double delta_lamda = lamda2-lamda1;
		
		double a = Math.pow(Math.cos(theta2)*Math.sin(delta_lamda),2);
		double b = Math.pow(Math.cos(theta1)*Math.sin(theta2) - Math.sin(theta1)*Math.cos(theta2)*Math.cos(delta_lamda),2);
		double c = Math.sin(theta1)*Math.sin(theta2)+Math.cos(theta1)*Math.cos(theta2)*Math.cos(delta_lamda);
		
		double delta_ror = Math.atan(Math.sqrt(a+b)/c);
		return 6371*delta_ror;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please input your city");
		String cityname = sc.nextLine().trim().toLowerCase();
		System.out.println("please input your country Code(ex.th for thailand");
		String countryname = sc.nextLine().trim().toLowerCase();
		System.out.println("please input length(km)");
		double k = sc.nextDouble();
		
		try
		{
			City city_A = null;
			Scanner filesc = new Scanner(new BufferedReader(new FileReader(new File("/Users/edgarden/Document/"))));
			filesc.nextLine();
			while(filesc.hasNext())
			{
				String s = filesc.nextLine();
				City city = parse(s);
				if(city.City.equals(cityname)&& city.Country.equals(countryname))
				{
					city_A = city;
					break;
				}
			}
				//System.out.println(city);
				filesc.close();
				if(city_A == null)
				{
					System.out.println("CITY NOT FOUND");
					return;
				}
				filesc = new Scanner(new BufferedReader(new FileReader(new File("/Users/edgarden/Document/"))));
				filesc.nextLine();
				while(filesc.hasNext())
				{
					String s = filesc.nextLine();
					City city =parse(s);
					double dist = getDistance(city,city_A);
					if(Math.abs(dist) < k)
					{
						System.out.println(city);
					}
				}
				
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
