import java.util.Arrays;

public class Q5
{
	public static boolean isObjectInteger(Object o)
	{
	    return o instanceof Integer;
	}
	

	public static void dbSort(Object[] a)
	{
		Object[] num= new Object[10];
		Object[] words = new Object[10];
		int isize = 0;
		int ssize = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(isObjectInteger(a[i]))
			{
				num[isize] = (int)a[i];
				isize++;
			}
			else
			{
				words[ssize] = ""+a[i];
				ssize++;
			}
		}
		Object[] nums= new Object[isize];
		for(int i = 0 ; i < isize; i++)
		{
			nums[i] = num[i];
		}
		Object[] word = new Object[ssize];
		for(int i = 0 ; i < ssize; i++)
		{
			word[i] = words[i];
		}
		Arrays.sort(nums);
		Arrays.sort(word);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(word));

		
	}
	
	public static void main(String[] args)
	{
		Object[] a = {"string",3,45,7,"ant","birds", "cats",4,7,8};
		dbSort(a);
	}

}
