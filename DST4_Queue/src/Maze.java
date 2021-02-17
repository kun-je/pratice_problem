import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Maze extends JFrame
{
	int[][] maze = new int[10][10];

	public static void main(String[] args)
	{
		new Maze();
	}


	public Maze()
	{
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[0].length; j++)
			{
				maze[i][j] = -1;
				if (Math.random() < 0.2)
				{
					maze[i][j] = -10;
				}
			}
		}
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[0].length; j++)
			{
				System.out.println(maze[i][j] + "\t");
			}
			System.out.println();
		}
		
		findPath(new Point(0, 0), new Point(9, 9));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);


	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.pink);
		g.fillRect(50, 50, 50, 50);
		Iterator<Point> xx = path.iterator();
		while(xx.hasNext())
		{
			Point p = xx.next();
			g.setColor(Color.pink);
			g.fillRect(50 + p.x*50, 50+p.y*50, 50, 50);
		}
		g.setColor(Color.black);
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[0].length; j++)
			{
				g.drawString("" + maze[i][j], 50 + j * 50 + 20, i * 50 + 80);
				if (maze[i][j] == -10)
				{
					g.fillRect(50 + j * 50, 50 + i * 50, 50, 50);
				} else
				{
					g.drawRect(50 + j * 50, 50 + i * 50, 50, 50);

				}
			}
		}
	}
	
	int[][]dir = new int[10][10];
	LinkedList<Point> path = new LinkedList<Point>();

	public void findPath(Point from, Point to)
	{
		maze[from.y][from.x] = 0;
		LinkedList<Point> q = new LinkedList<Point>();
		q.addFirst(from);// enqueue
		boolean isValid = false;
		while (!q.isEmpty())
		{
			// dequeue
			Point n = q.getLast();
			q.removeLast();

			if (n.x == to.x && n.y == to.y)
			{
				isValid = true;
				break;
			}
			// หาทางไปจนสุดท้าย
			if (go(n.x - 1, n.y, maze[n.y][n.x], q))
			{
				dir[n.y][n.x - 1] = 1;//right
			}
			if (go(n.x + 1, n.y, maze[n.y][n.x], q))
			{
				dir[n.y][n.x + 1] = 2;//left

			}
			if (go(n.x, n.y + 1, maze[n.y][n.x], q))
			{
				dir[n.y + 1][n.x] = 3;//up

			}
			if (go(n.x, n.y - 1, maze[n.y][n.x], q))
			{
				dir[n.y - 1][n.x] = 4;//down

			}
			
		}
		// จากสุดท้ายมาหาเรา
		if (isValid)
		{
			Point n = new Point(to.x, to.y);
			while (n.x != from.x || n.y != from.y)
			{
				path.addFirst(n);
				if (dir[n.y][n.x] == 1)
				{
					n = new Point(n.x + 1, n.y);
				}
				else if (dir[n.y][n.x] == 2)
				{
					n = new Point(n.x - 1, n.y);
				}
				else if (dir[n.y][n.x] == 3)
				{
					n = new Point(n.x, n.y-1);
				}
				else if (dir[n.y][n.x] == 4)
				{
					n = new Point(n.x, n.y+1);
				}
			}
		}
	}

	//ทางที่สามารถไปได้
	public boolean go(int x, int y, int k, LinkedList<Point> q)
	{
		if (x >= 0 && x < maze[0].length && y >= 0 && y < maze.length && maze[y][x] == -1)
		{
			q.addFirst(new Point(x, y));
			maze[y][x] = k + 1;
			return true;
		}
		return false;
	}

}
