import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Ball
{

	public void draw(Graphics g)
	{
		g.setColor(new Color(R,G,B,200));
		g.fillRect((int)pos.x, (int)pos.y, Size, Size);
	}

}
