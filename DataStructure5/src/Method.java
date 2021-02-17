
public class Method
{

	public static void main(String[] args)
	{
		int[]x = new int[] {1,5,13,20,100,101,102,103};
		System.out.println("find 102 : "+binarySearch(x,102));
		System.out.println("find 5 : "+binarySearch(x,5));
		System.out.println("find 1000 : "+binarySearch(x,1000));
		System.out.println("find 15 : "+binarySearch(x,15));
		System.out.println("find 20 : "+binarySearch(x,2));

	}
	//หาตำแหน่งตัวเลข(ต้องเรียงเลขก่อน)
	public static int binarySearch(int [] a, int x)
	{
		int left = 0, right = a.length-1;
		int mid = (left + right)/2;
		while(true)
		{
			if(a[mid] == x)
			{
				return mid;
			}
			if(a[mid]>x)
			{
				right = mid-1;//don't need too look at mid
			}
			else
			{
				left = mid + 1;
			}
			if(right < left)
			{
				return -1;
			}
			mid = (left+right)/2;
		}
	}

}
