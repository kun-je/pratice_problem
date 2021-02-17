import java.util.Scanner;

public class Q2
{

	public static void main(String[] args)
	{
		int n = 5;
		int avg = 0;
		String []name = new String[n];
		int []score = new int[n];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < name.length;i++)
		{
			name[i] = sc.nextLine();
			score[i] = sc.nextInt();
			sc.nextLine();
			avg += score[i];
		} 
		avg = avg/n;
		for(int i = 0; i < n;i++)
		{
			if(score[i] < avg)
			{
				System.out.println("name : "+name[i]+" Score :"+score[i]);
			}
		}
	}

}
