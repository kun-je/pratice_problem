import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BSTreeTestGUI extends JPanel//มีJpanelเพราะไม่ต้องการให้กระพิบและเอาไอ้นี้ไปใส่ในjframeอีกทีนึง
{
	BSTree t;
	public BSTreeTestGUI()
	{
		 t = new BSTree();
		
		/*t.add(50);
		t.add(3);
		t.add(15);
		t.add(4);
		t.add(40);*/
		for(int i  =0 ;i < 50; i++)
		{
			int j =(int)(Math.random()*100);
			//System.out.println(j);
			t.add(j);
		}
			
		
		/*t.inOrder(new VisiteTreeI()
				{
					public void visit(BSTreeNode node)
					{
						System.out.println(node.data);
					}
				});

		
		System.out.println(Math.pow(2, 23));
		System.out.println(t.height());*/
		
		JFrame f =  new JFrame();
		f.add(this);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		t.draw(g,this.getWidth(),this.getHeight());
	}
	
	public static void main(String[] args)
	{
		new BSTreeTestGUI();
	}


}
