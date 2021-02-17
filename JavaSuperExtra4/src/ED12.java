import java.util.Scanner;

public class ED12
{

	public static void main(String[] args)
	{
		String a = (new Scanner(System.in)).nextLine();//input and read at the same time
		int [] temp = new int [a.length()];
		for(int i = 0; i < temp.length;i++)
		{
			temp[i] = Integer.parseInt(""+a.charAt(i));
		}
		String [][] s = new String[][] 
		{
			{
				"xxxx",
				"x--x",
				"x--x",
				"x--x",			
				"xxxx"
			},
			{
				"---x",
				"---x",				
				"---x",
				"---x",	
				"---x",
			},
			{
				"xxxx",
				"---x",
				"xxxx",
				"x---",
				"xxxx",
				
			},
			{
				"xxxx",
				"---x",
				"xxxx",
				"---x",
				"xxxx",
				
			},
			{
				"x--x",
				"x--x",
				"xxxx",
				"---x",
				"---x",
			},
			{
				"xxxx",
				"x---",
				"xxxx",
				"---x",
				"xxxx",
				
			},
			{
				"x---",
				"x---",
				"xxxx",
				"x--x",
				"xxxx",
				
			},
			{
				"xxxx",
				"---x",
				"---x",
				"---x",
				"---x",
			},
			{
				"xxxx",
				"x--x",
				"xxxx",
				"x--x",
				"xxxx",
			},
			{
				"xxxx",
				"x--x",
				"xxxx",
				"---x",
				"---x",
			}
			
		};
		//pattern lift that they gave us
		for(int i = 0; i <s[0].length;i++)
		{
			for(int j = 0; j < a.length(); j++)
			{
				System.out.print(s[temp[j]][i]+"\t");
			}
			System.out.println();
		}
	}

}
