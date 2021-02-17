package M;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import common.GlobalData;



public class ProductManager
{
	public static ArrayList<productDB> getAllProduct()
	{
		ArrayList<productDB> list = new ArrayList<productDB>();

		try
		{
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			// our SQL SELECT query.
			// if you only need a few columns, specify them by name instead of using "*"
			String query = "SELECT * FROM products";

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next())
			{
				int id = rs.getInt("product_id");
				String pName = rs.getString("product_name");
				double price = rs.getDouble("price_per_unit");
				String dresc = rs.getString("product_description");
				byte[] img_byte = rs.getBytes("product_image");
				ByteArrayInputStream bais = new ByteArrayInputStream(img_byte);
				BufferedImage bufferedimg = ImageIO.read(bais);
				bais.close();
				productDB cc = new productDB(id, pName, price, dresc, bufferedimg);
				list.add(cc);
			}
			st.close();
		} catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return list;
	}
}
