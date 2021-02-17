import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphGUI extends JPanel
{
	GraphAdjList<Integer> gg;
	public GraphGUI()
	{
		gg = new GraphAdjList<Integer>();
		gg.addNode(1);
		gg.addNode(2);
		gg.addNode(3);
		gg.addNode(4);
		gg.addNode(5);
		
		gg.addEdge(1, 2, 1);
		gg.addEdge(1, 3, 1);
		gg.addEdge(2, 3, 1);
		gg.addEdge(3, 4, 1);
		gg.addEdge(3, 5, 1);
		gg.addEdge(4, 5, 1);
		gg.addEdge(1, 4, 1);
		
		/*for(int i =0; i < 30;i ++)
		{
			gg.addNode(i);
		}
		
		for(int i =0; i < 90;i ++)
		{
			int a = (int)(Math.random()*31);
			int b = (int)(Math.random()*31);
			if(a!= b)
			{
				gg.addEdge(a, b, 1);
			}

		}*/
	
		Thread t = new Thread(new Runnable()
				{

					@Override
					public void run()
					{
						while(true)
						{
							try
							{
								Thread.sleep(50);
							} catch (InterruptedException e)
							{
								e.printStackTrace();
							}
							gg.updatePos(getWidth(),getHeight());
							repaint();
						}
					}
			
				});
		t.start();
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,500);
		f.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		gg.draw(g);
	}
	
	public static void main(String[] args)
	{
		new GraphGUI();
	}

}
