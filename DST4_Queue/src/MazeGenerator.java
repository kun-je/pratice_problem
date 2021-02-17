import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MazeGenerator
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter(new File("Maze.txt"));
		for(int i = 0; i < 40 ; i++)
		{
			for(int j = 0; j < 40; j++)
			{
				if(Math.random() < 0.2)
				{
					pw.print("x");
				}
				else
				{
					pw.print(" ");
				}
				if(i == 0 && j == 0 || i == 39 && j == 39)
				{
					pw.print(" ");

				}
				
			}
			pw.println();
		}
		pw.close();
	}

}
