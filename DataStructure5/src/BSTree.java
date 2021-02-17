import java.awt.Color;
import java.awt.Graphics;

public class BSTree
{
	public TreeNode root;
	
	public BSTree()
	{
		
	}

	public void add(int x)
	{
		if (root == null)
		{
			root = new TreeNode(x, null, null);
			return;
		}
		TreeNode n = root;
		while (true)
		{
			if (n.data == x)
			{
				return;
			}
			if (n.data < x)
			{
				if (n.right == null)
				{
					n.right = new TreeNode(x, null, null);
					return;
				} else
				{
					n = n.right;
				}
			} else
			{
				if (n.left == null)
				{
					n.left = new TreeNode(x, null, null);
					return;
				} else
				{
					n = n.left;
				}
			}
		}
	}
	
	public void add2(int x)
	{
		if(root == null )
		{
			root = new TreeNode(x,null,null);
			return;
		}
		add3(x,root);
	}
	
	private void add3(int x, TreeNode n)
	{
		if(n == null)return;
		if(n.data == x) return;
		if(n.data > x)
		{
			if(n.left == null)
			{
				n.left = new TreeNode(x,null,null);
			}
			else
			{
				add3(x,n.left);
			}
		}
		else
		{
			if(n.right == null)
			{
				n.right = new TreeNode(x,null,null);
			}
			else
			{
				add3(x,n.right);
			}
		}
	}
	
	public int height()
	{
		return height(root);
	}
	
	int stepwidth;
	int stepheight;
	private int height(TreeNode n)
	{
		if(n == null)
		{
			return -1;
		}
		if(n.left == null && n.right == null )
		{
			return 0;
		}
		int nl , nr;
		nl = height(n.left);
		nr = height(n.right);
		int max = nl > nr ? nl : nr;
		return max+1;//cause need to count ourself as well
	}
	
	//leaves count
	public int Leaves()
	{
		return Leaves(root);
	}
	
	private int Leaves(TreeNode n)
	{
		if(n == null)
		{
			return 0;
		}
		if(n.left == null && n.right == null )
		{
			return 1;
		}
		int nl , nr;
		nl = Leaves(n.left);
		nr = Leaves(n.right);
		return nl+nr;
	}
	
	//node count
	public int size()
	{
		return size(root);
	}
	
	private int size(TreeNode n)
	{
		if(n == null)
		{
			return 0;
		}
		if(n.left == null && n.right == null )
		{
			return 1;
		}
		int nl , nr;
		nl = size(n.left);
		nr = size(n.right);
		return nl+nr+1;
	}
	
	public void preorder()
	{
		preorder2(root);
	}
	
	private void preorder2(TreeNode n)
	{
		if(n == null)
		{
			return;
		}
		System.out.println(n.data);
		preorder2(n.left);
		preorder2(n.right);
	}
	
	public void inorder()
	{
		inorder(root);
	}
	
	private void inorder(TreeNode n)
	{
		if(n == null)
		{
			return;
		}
		inorder(n.left);
		System.out.println(n.data);
		inorder(n.right);
	}
	
	public void postorder()
	{
		postorder(root);
	}
	
	private void postorder(TreeNode n)
	{
		if(n == null)
		{
			return;
		}
		postorder(n.left);
		postorder(n.right);
		System.out.println(n.data);
	}
	
	public void draw(int swidth, int sheight, Graphics g)
	{
		int h = height();
		int s = size();
		stepwidth = swidth/(s+1);
		stepheight = sheight/(h+2);
		draw2(g,root,1,1);
	}
	
	public int draw2(Graphics g , TreeNode n, int y, int x)
	{
		if(n == null)
		{
			return x;
		}
		if(n.left != null)
		{
			int centerLeft = x;// เก็บจดศูนกลางของรูทด้านซ้าย
			if(n.left.left != null)
			{
				centerLeft = size(n.left.left)+x;
			}
			x = draw2(g,n.left,y+1,x);
			g.setColor(new Color(156,93,8));
			g.drawLine(centerLeft*stepwidth + 10, (y+1)*stepheight - 5, x* stepwidth, y*stepheight);
		}
		n.draw(g, x, y, stepwidth, stepheight);
		if(n.right != null)
		{
			int centerRight = x+1;// เก็บจดศูนกลางของรูทด้านซ้าย
			if(n.right.left != null)
			{
				centerRight = size(n.right.left)+x+1;
			}
			int now_x = x;
			x = draw2(g,n.right,y+1,x+1)-1;
			g.setColor(new Color(156,93,8));
			g.drawLine((now_x-1)*stepwidth + 20, y*stepheight, (centerRight)* stepwidth-10,( y+1)*stepheight-10);
		}
		return x+1;
	}
	
	public void draw(Graphics g,int x, int y, int sw, int sh,int px, int py)
	{
		g.drawLine(x*sw, y*sh, px*sw, py*sh);
	}

}
