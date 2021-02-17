package M;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import common.GlobalData;

public class BookingManager {
	
	public static ArrayList<BookingDB> getAllBooking() {
		ArrayList<BookingDB> list = new ArrayList<BookingDB>();
		try {
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			String query = "SELECT * FROM customer WHERE customer_id = '"+GlobalData.CurrentCustomer_customerId+"'";

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				int customer_id = rs.getInt("customer_id");
				int room_id = rs.getInt("room_id");
				String start_date = rs.getString("start_date");
				String end_date = rs.getString("end_date");

				BookingDB cc = new BookingDB(id,customer_id, room_id, start_date, end_date);
				list.add(cc);
				System.out.format("%d, %d, %s, %s \n", id, room_id, start_date, end_date);
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return list;
	}


}
