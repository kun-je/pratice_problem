import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class Q6 extends JFrame
{
	int window_size = 5;
	ArrayList<Double> a,mv;
	
	
	public Q6() 
	{
		a = new ArrayList<Double>();
		try 
		{
			File f = new File("Users/edgarde/Documents");
			Scanner sc= new Scanner(f);
			while(sc.hasNext())
			{
				String s = sc.nextLine();
				double x = Double.parseDouble(s);
				a.add(x);
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		mv = new ArrayList<Double>();
		for(int k  = window_size; k < a.size();k++)
		{
			if(k < window_size)
			{
				mv.add(0.0);
			}
			else
			{
				double sum = 0;
				for(int i =k; i < k; i++)
				{
					sum += a.get(i);
				}
				double avg = sum/window_size;
				mv.add(avg);
			}
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,700);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		for(int i = 1; i < a.size(); i++)
		{
			g.drawLine((i-1)*2,(int) (700-a.get(i)*14), i*2, (int)(700-a.get(i)*14));
		}
		g.setColor(Color.RED);
		for(int i = 1; i < mv.size();i++)
		{
			g.drawLine((i-1)*2, (int)(700-mv.get(i-1)*14), i*2, (int)(700-mv.get(i)*14));
		}
	}
	
	public static void main(String[] args)
	{
		new Q6();
	}


}


