import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Population
{

	public static void main(String[] args)
	{
		Scanner sc = null;
		try 
		{
			ArrayList<City> citys = new ArrayList<City>();
			int i =0;
			sc = new Scanner(new File("⁨Users⁩/⁨ed_garden⁩/⁨Documents/world.txt⁩"));
			while(sc.hasNext())
			{
				String s = sc.nextLine();
				String[]ss = s.split(";");
				City c = new City();
				System.out.println(i);
				c.id = Integer.parseInt(ss[0].substring(1,ss[0].length()-1));
				c.name = (ss[1].substring(1,ss[1].length()-1));
				c.country = (ss[2].substring(1, ss[2].length()-1));
				if(ss[3].contentEquals(""))
				{	
				}
				else
				{
					c.district = (ss[3].substring(1,ss[3].length()-1));
				}
				c.population = Long.parseLong(ss[4].substring(1,ss[4].length()-1));
				citys.add(c);
				i++;
				if(i > 4000)
				{
					break;
				}
			}
			City []city_array = new City[citys.size()];
			city_array = citys.toArray(city_array);
			//compare 2 city
			Arrays.sort(city_array, new Comparator<City>()
			{
				public int compare(City o1, City o2)
				{
					if(o1.population<o2.population)return -1;
					if(o1.population>o2.population)return 1;
					return 0;
				}
			});
			
			for( i = 0;i < city_array.length/2;i++)
			{
				City temp = city_array[i];
				city_array[i] = city_array[city_array.length -i -1];
				city_array[city_array.length -i-1] =temp;
			}
			for(int j = 0; j < city_array.length;j++)
			{
				System.out.println(city_array[j]);
			}
			
			PrintWriter pw = new PrintWriter(new File("output.txt"));
			for(int j =0; j < city_array.length; j++)
			{
				pw.println(city_array[j]);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(sc != null)
			{
				sc.close();
			}
		}
	}

}
