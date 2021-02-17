import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class BarGraph extends JFrame
{
	int []data = new int[] {50,100,80,120,140,340,200};
	String []data_name = new String[] {"aaaaaaaa","bbbbbb","ccccc","ddddd","eeee",
			"ffffff","ggggggg","hhhhhhh"};
	Color []colors;
	
	public BarGraph()
	{
		colors = new Color[data.length];
		for(int i =0;  i< data.length;i++)
		{
			colors[i] = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//ความกว้างขอหน้าจอ
		setSize(1000,500);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		int sum = 0;
		for(int i =0; i < data.length; i++)
		{
			//ค่าxแต่ละแท่งห่างกัน  55px และเว้นจากซ้ายมา50
			//ค่าyขอบล่างลบกับความสูงของข้อมูล
			g.fillRect(i*55+50, 450-data[i], 50, data[i]);
			g2d.translate(i*55+50, 420+20);
			g2d.rotate(Math.PI/6);
			g.drawString(data_name[i], 0, 0);
			g2d.rotate(-(Math.PI/6));
			g2d.translate(-(i*55+50) ,-( 420+20));
			sum+=data[i];
		}
		//data name
		int angle = 0;
		for(int i = 0; i < data.length;i++)
		{
			int angle2 =(int) (Math.round((double)data[i]*360/sum));
			g.setColor(colors[i]);
			g.fillArc(500, 150, 400, 400, angle, angle2);
			
			//จุดศูนย์กลางของวงกลม
			g2d.translate(700, 500);
			g2d.rotate(-Math.PI/180 * angle -Math.PI/180 *angle2/2);
			g.setColor(Color.BLACK);
			g.drawString(data_name[i], 150, 0);
			g2d.rotate(+Math.PI/180 * angle +Math.PI/180 *angle2/2);
			g2d.translate(-700,- 500);
			angle+= angle2;
		}
	}
	
	public static void main(String[]args)
	{
		new BarGraph();
	}
	

}
