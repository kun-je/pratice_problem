import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_binaryTree extends JPanel
{
	BSTree t;

	public GUI_binaryTree()
	{
		t = new BSTree();

		for(int i = 0 ;  i < 10 ; i++)
		{
			t.add((int)(Math.random()*100));
		}

		/*t.add(50);
		t.add(3);
		t.add(15);
		t.add(4);
		t.add(40);

		t.inOrder(new VisiteTreeI()
				{
					public void visit(BSTreeNode node)
					{
						System.out.println(node.data);
					}
				});*/

		//System.out.println(Math.pow(2, 23));
		//System.out.println(t.height());

		JFrame f =  new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}


	public void paint(Graphics g)
	{
		super.paint(g);
		t.draw( this.getWidth(),  this.getHeight(),  g);
	}


	public static void main(String[] args)
	{
		new GUI_binaryTree();
	}

}
