import java.awt.Color;
import java.awt.Graphics;

public class BSTreeNode
{
	public int data;
	public BSTreeNode left;
	public BSTreeNode right;
	
	public BSTreeNode()
	{
		data = 0;
		left = null;
		right = null;
	}
	
	public BSTreeNode(int x)
	{
		this();
		data = x;
	}
	
	public void draw(Graphics g,int x, int y,int num_x)
	{
		g.setColor(Color.green);
		g.fillOval(x-15, y-15, 30, 30);
		g.setColor(Color.black);
		g.drawString(""+data,x,y);
		//g.drawString(""+num_x,x,y);

		
		
	}
}
