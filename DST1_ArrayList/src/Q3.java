import java.util.Arrays;
import java.util.Scanner;

public class Q3
{

	public static void main(String[] args)
	{
		int [][] score_mini = new int[2][10];
		String [] footballTeam = new String[] {"checkrang", "uvantus","AB Milan","maburn", "liverkoki", "arsaydahe","sealsad","bazerola","raulmadi","manwow"};
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < footballTeam.length;i++)
		{
			System.out.print(footballTeam[i]+ "  \t");
		}
		System.out.println();
		for(int i = 0; i < score_mini.length;i++)
		{
			for(int j = 0; j < score_mini[0].length;j++)
			{
				score_mini[i][j] = (int)(Math.random()*6);
				System.out.print(score_mini[i][j] + "\t\t");
			}
			System.out.println();
		}
		for(int i = 0; i < score_mini.length-1;i++)
		{
			for(int j = 0; j < score_mini[0].length;j++)
			{
				
				if(score_mini[i][j] > score_mini[i+1][j])
				{
					System.out.println(footballTeam[j]);
				}
			}
		}
			
	}

}
