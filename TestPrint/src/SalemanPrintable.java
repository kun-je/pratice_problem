import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;

public class SalemanPrintable implements Printable
{
	ArrayList<Saleman> list;
	public SalemanPrintable(ArrayList<Saleman> xlist)
	{
		list = xlist;
	}
	 public int print(Graphics g, PageFormat pf, int page)
		      throws PrinterException {

		    // We have only one page, and 'page'
		    // is zero-based
		    if (page > 0 || list.size() == 0|| list == null) {
		         return NO_SUCH_PAGE;
		    }

		    // User (0,0) is typically outside the
		    // imageable area, so we must translate
		    // by the X and Y values in the PageFormat
		    // to avoid clipping.
		    Graphics2D g2d = (Graphics2D)g;
		    g2d.translate(pf.getImageableX(), pf.getImageableY());

		    // Now we perform our rendering
		    g.drawString("Hello world!", 100, 100);
		    int x = 50;
		    int y = 200;
		    for(int i = 0; i < list.size();i++)
		    {
		    	 y = 700-list.get(i).totalSale;
		    	g2d.fillRect(x, y, 20, 700-list.get(i).totalSale);
		    	
		    	g2d.translate(x, 700+10);
		    	g2d.rotate(Math.PI/3);
		    	g2d.drawString(list.get(i).name, 0, 0);//print แบบเอียงๆ
		    	g2d.rotate(-Math.PI/3);
		    	g2d.translate(-x, (700+10));

		    	x+= 22;
		    }

		    // tell the caller that this page is part
		    // of the printed document
		    return PAGE_EXISTS;
		  }
}
