
public class MazeSolver
{
	public int[][] maze;
	public PointInMaze[][] pmaze;

	public void solve(int[][] mazex)
	{
		MyLinkedListQueue<PointInMaze> q = new MyLinkedListQueue<PointInMaze>();
		maze = mazex;
		pmaze = new PointInMaze[maze.length][maze[0].length];
		for (int i = 0; i < 40; i++)
		{
			for (int j = 0; j < 40; j++)
			{
				pmaze[i][j] = new PointInMaze();
				pmaze[i][j].x = j;
				pmaze[i][j].y = i;
				pmaze[i][j].count_walk = 0;

				pmaze[i][j].visited = false;

				if (maze[i][j] == -10)
				{
					pmaze[i][j].isVaild = false;
				} else
				{
					pmaze[i][j].isVaild = true;

				}
			}
		}
		PointInMaze start = pmaze[0][0];
		PointInMaze end = pmaze[maze.length - 1][maze[0].length - 1];

		q.enqueue(start);
		start.visited =true;
		while (q.size() > 0)
		{
			PointInMaze now = q.dequeue();
			if (now.x > 0 && pmaze[now.y][now.x - 1].isVaild && !pmaze[now.y][now.x - 1].visited)
			{
				pmaze[now.y][now.x - 1].prev = now;//goto left
				pmaze[now.y][now.x - 1].count_walk= now.count_walk+1;
				q.enqueue(pmaze[now.y][now.x - 1]);
				PointInMaze next = pmaze[now.y][now.x-1];
				next.visited = true;
				if(next == end)
				{
					break;
				}
			}
			if (now.y > 0 && pmaze[now.y- 1][now.x ].isVaild && !pmaze[now.y- 1][now.x].visited)
			{
				pmaze[now.y- 1][now.x].prev = now;//goto up
				pmaze[now.y- 1][now.x].count_walk= now.count_walk+1;
				q.enqueue(pmaze[now.y- 1][now.x]);
				PointInMaze next = pmaze[now.y-1][now.x];
				next.visited = true;
				if(next == end)
				{
					break;
				}
			}
			if (now.x < maze[0].length-1 && pmaze[now.y][now.x +1].isVaild && !pmaze[now.y][now.x + 1].visited)
			{
				pmaze[now.y][now.x + 1].prev = now;//goto right
				pmaze[now.y][now.x + 1].count_walk= now.count_walk+1;
				q.enqueue(pmaze[now.y][now.x + 1]);
				PointInMaze next = pmaze[now.y][now.x+1];
				next.visited = true;
				if(next == end)
				{
					break;
				}
			}
			if (now.y > maze[0].length-1 && pmaze[now.y+1][now.x ].isVaild && !pmaze[now.y+1][now.x].visited)
			{
				pmaze[now.y+1][now.x].prev = now;//goto down
				pmaze[now.y+1][now.x].count_walk= now.count_walk+1;
				q.enqueue(pmaze[now.y+1][now.x]);
				PointInMaze next = pmaze[now.y+1][now.x];
				next.visited = true;
				if(next == end)
				{
					break;
				}
			}
		}
		PointInMaze ee = end;
		while(ee.prev != null && ee!=start)
		{
			System.out.println(ee.y+" " +ee.x);
			mazex[ee.y][ee.x] = 1;//already visit
			ee =ee.prev;
		}

	}

}

class PointInMaze
{
	public int x;
	public int y;
	public int count_walk;
	public PointInMaze prev;
	public boolean isVaild;
	public boolean visited;

}
