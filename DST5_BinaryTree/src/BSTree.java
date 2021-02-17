import java.awt.Graphics;

public class BSTree
{
	BSTreeNode root;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public void add(int x)
	{
		if (root == null)
		{
			root = new BSTreeNode(x);
			return;
		}
		add(root, x);
	}

	private void add(BSTreeNode n, int x)
	{
		if (n == null)
			return;
		if (n.data == x)
			return;
		if (n.data > x)
		{
			if (n.left == null)
			{
				n.left = new BSTreeNode(x);
				return;
			}
			add(n.left, x);
		} else if (n.data < x)
		{
			if (n.right == null)
			{
				n.right = new BSTreeNode(x);
				return;
			}
			add(n.right, x);
		}
	}

	public void add2(int x)
	{
		if (root == null)
		{
			root = new BSTreeNode(x);
			return;
		}
		BSTreeNode n = root;
		while (true)
		{
			if (n.data > x)
			{
				if (n.left == null)
				{
					n.left = new BSTreeNode(x);
					return;
				}
				n = n.left;
			} else if (n.data < x)
			{
				if (n.right == null)
				{
					n.right = new BSTreeNode(x);
					return;
				}
				n = n.right;
			} else
			{
				break;
			}
		}
	}

	public int num()
	{
		if (root == null)
			return 0;
		return num(root);
	}

	private int num(BSTreeNode n)
	{
		if (n == null)
			return 0;
		return num(n.left) + num(n.right) + 1;
	}
	
	public int height()
	{
		if (root == null)
			return -1;
		return height(root);
	}
	

	private int height(BSTreeNode n)
	{
		if (n == null)
			return -1;
		int l = height(n.left);
		int r = height(n.right);
		return (l>r? l :r)+1;
	}
	
	public void draw(Graphics g, int screen_width, int screen_height)
	{
		int n = num();
		int h = height();
		
		int sw = screen_width/(n+2);
		int sh = screen_height / (h+2);
		
		draw(g, root,sw,sh,1,1,-1,-1);
	}
	
	
	private int draw(Graphics g, BSTreeNode n, int step_width, int stepHeight, int x, int y,int x_parent, int y_parent)//x and y is number of node along their axis
	{
		if(n == null)
		{
			return 0;
		}
		//draw left
		int num_current = 0;
		int num_left = num(n.left);
		num_current += draw(g,n.left, step_width,stepHeight,x, y+1,num_left+x, y);
		
		
		n.draw(g, (x+num_current)*step_width, y*stepHeight,x+num_current);
		
		if(x_parent != -1 && y_parent != -1)
		{
			g.drawLine((x+num_current)*step_width, y*stepHeight, (x_parent)*step_width, y_parent*stepHeight);
		}
		num_current += 1;
		num_current += draw(g, n.right, step_width,stepHeight,x+num_current, y+1,num_current+x-1 ,y);
		return  num_current;
	}
	
}
	/*

	public void draw2(Graphics g, BSTreeNode n, int screenWidth_start, int screenWidth_end, double step_y, int y)
	{
		if (n == null)
		{
			return;
		}
		int m = ((screenWidth_start + screenWidth_end) / 2);
		draw2(g, n.left, screenWidth_start, m, step_y, y + 1);// draw left
		n.draw(g, m, (int) (y * step_y), 0);
		draw2(g, n.right, m, screenWidth_end, step_y, y + 1);// draw right

		// วาดเส้นข้างซ้าย
		if (n.left != null)
		{
			int ml = (screenWidth_start + m) / 2;
			g.drawLine(m, (int) (y * step_y), ml, (int) ((y + 1) * step_y));
		}

		// วาดเส้นข้างขวา
		if (n.right != null)
		{
			int mr = (screenWidth_end + m) / 2;
			g.drawLine(m, (int) (y * step_y), mr, (int) ((y + 1) * step_y));
		}

	}

	public void inOrder()
	{
		if (root == null)
			return;
		inOrder(root, x);

	}

	private void inOrder(BSTreeNode n, VisiteTreeI x)
	{
		if (n == null)
			return;
		inOrder(n.left, x);
		x.visit(n);
		inOrder(n.right, x);
	}

	public void preOrder()
	{
		if (root == null)
			return;
		preOrder(root, x);
	}

	private void preOrder(BSTreeNode n, VisiteTreeI x)
	{
		if (n == null)
			return;
		x.visit(n);
		preOrder(n.left, x);
		preOrder(n.right, x);
	}

	public void postOrder()
	{
		if (root == null)
			return;
		postOrder(root, x);
	}

	private void postOrder(BSTreeNode n, VisiteTreeI x)
	{
		if (n == null)
			return;
		postOrder(n.left, x);
		postOrder(n.right, x);
		x.visit(n);
	}
}

interface VisiteTreeI
{
	public void visit(BSTreeNode node);

}*/
