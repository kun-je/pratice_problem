import java.util.Arrays;

public class EL7
{
	public static void bubbleSort(int [] d)
	{
		for(int i = 0; i < d.length;i ++)
		{
			for(int j = 1; j < d.length-i;j++)
			{
				if((d[j-1])> d[j])
				{
					int temp = d[j-1];
					d[j-1] =d[ j];
					d[j] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(d));
	}
	public static void main(String[] args)
	{
		int [] d = {12,45,76,89,4,68,892,24,13,89,99};
		bubbleSort(d);
	}

}
