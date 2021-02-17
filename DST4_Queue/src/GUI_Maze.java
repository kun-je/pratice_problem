import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;

public class GUI_Maze extends JFrame
{
	int[][] maze = new int[40][40];
	
	public void readFile()
	{
		Scanner sc;
		try
		{
			sc = new Scanner (new File("maze.txt"));
			int j = 0;
			while(sc.hasNext())
			{
				String s = sc.nextLine();
				for(int i = 0; i < s.length() ; i++)
				{
					if(s.charAt(i)=='x')
					{
						maze[j][i] = -10;
					}
				}
				j++;
			}
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public GUI_Maze()
	{
		
		readFile();
		MazeSolver solver = new MazeSolver();
		solver.solve(maze);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,700);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		int size = 15;//ขนาดของแต่ละช่องของเรา
		for(int i = 0; i < 40 ; i++)
		{
			for(int j = 0; j < 40; j++)
			{
				if(maze[i][j] == -10)
				{
					g.setColor(Color.black);
					g.fillRect(j*size+40, i*size+40, size, size);
				}
				else if(maze[i][j] ==1)
				{
					g.setColor(Color.pink);
					g.drawRect(j*size+40, i*size+40, size, size);
				}
				else
				{
					g.setColor(Color.black);
					g.fillRect(j*size+40, i*size+40, size, size);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		new GUI_Maze();
	}

}
