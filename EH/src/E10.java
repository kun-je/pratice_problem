import java.util.Arrays;

public class E10
{

	public static void main(String[] args)
	{
		int [][]a = new int[2][3];
		int []b = new int[3];
		int [][]c = new int[3][1];
		int count =1;
		//initialize array a
		for(int i =0;i <a.length;i++)
		{
			for(int j =0;j <a[0].length;j++)
			{
				
			}
		}
		
		//initialize array b
		for(int i =0;i <b.length;i++)
		{
			b[i] = count;
			count ++;
		}
		System.out.println(Arrays.toString(b));
		
		//initialize array c
		count =1;
		for(int i =0;i <c.length;i++)
		{
			for(int j =0;j <c[0].length;j++)
			{
				c[i][j] = count;
			}
			count++;
		}
		System.out.println(Arrays.deepToString(c));

	}

}
