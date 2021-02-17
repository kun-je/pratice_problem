package M;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import common.GlobalData;

public class RoomManager 
{
	public static ArrayList<RoomDB> getAllRoom() {
		ArrayList<RoomDB> list = new ArrayList<RoomDB>();
		try {
			// create our  database connection
			//String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			//Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			String query = "SELECT * FROM room";

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String type = rs.getString("type");
				int capacity = rs.getInt("capacity");
				int price = rs.getInt("price");
			

				RoomDB cc = new RoomDB(id, type, capacity, price);
				list.add(cc);

				System.out.format("%d, %s, %d, %d \n", id,type, capacity, price);
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return list;
	}
	

}
