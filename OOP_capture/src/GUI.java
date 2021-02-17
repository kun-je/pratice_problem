import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel
{
	Ball[] balls;
	//Rectangle[] rect;
	public GUI()
	{
		balls = new Ball[30];
		for(int i =0; i< 10;i++)
		{
			balls[i] = new Ball();
		}
		//rect = new Rectangle[10];
		for(int i =10; i< 20;i++)
		{
			balls[i] = new Rectangle();
		}
		for(int i =20; i< 30;i++)
		{
			balls[i] = new Star();
		}
		Thread t = new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						while(true)
						{
							try
							{
								Thread.sleep(20);
							} catch (InterruptedException e)
							{
								e.printStackTrace();
							}
							for(int i =0; i< balls.length;i++)
							{
								balls[i].move();
							}
						/*	for(int i =0; i< balls.length;i++)
							{
								rect[i].move();
							}*/
							repaint();
						}
					}
				});
		t.start();
		//สร้างจากใหม่ทับเก่า
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);//ขนาดจอ
		f.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);//วาดฉากหลังใหม่
		for(int i =0; i< balls.length;i++)
		{
			balls[i].draw(g);
		}
		/*for(int i =0; i< balls.length;i++)
		{
			rect[i].draw(g);
		}*/
		
	}

	public static void main(String[] args)
	{
		new GUI();
	}

}
