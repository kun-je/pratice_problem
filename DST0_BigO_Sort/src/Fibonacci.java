
public class Fibonacci {
	
	public static int fibo(int n )
	{
		if(n == 1|| n == 2)
		{
			return 1;
		}
		return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("The sequence of fibonacci of " + n + "number is : ");
		for(int i = 1; i <= n ; i++)
		{
			System.out.print(fibo(i) + "    ");
			
		}
		
		System.out.println("\nThe " + n + "th(st) number in the fibonacci sequence is : " + fibo(n));
		
		
		for(int i = 1; i <= 40; i++)
		{
			double a = fibo(i);
			double b = fibo(i +1);
			double c = b/a;
			System.out.println("After dividing the " + i + "th(st)  time :" + c);
		}
		System.out.println("Gloden ratio is about 1.6180339887498948482...");

	}

}
