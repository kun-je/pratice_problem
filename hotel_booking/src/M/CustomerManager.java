package M;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import common.GlobalData;

public class CustomerManager {
	public static ArrayList<CustomerDB> getAllCustomer() {
		ArrayList<CustomerDB> list = new ArrayList<CustomerDB>();
		try {
			// create our  database connection
			//String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			//Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			String query = "SELECT * FROM customer";

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("name");
				String lastName = rs.getString("surname");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				String password = rs.getString("password");

				CustomerDB cc = new CustomerDB(id, firstName, lastName, address, phone, password);
				list.add(cc);

				System.out.format("%d, %s, %s, %s, %s,%s \n", id, firstName, lastName, address, phone, password);
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return list;
	}

	public static void saveNewCustomer(CustomerDB x) {
		try {
			//String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			//Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			// our SQL SELECT query.
			String query = "INSERT INTO customer VALUE (0, '" + x.name + "','" + x.surname + "','" + x.address + "','"
					+ x.phone + "','" + x.password + "')";

			// create the java statement
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

	public static void editCustomer(CustomerDB x) {
		try {
			//String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			//Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			// our SQL SELECT query.
			String query = "UPDATE customer SET name = '" + x.name + "',  surname = '" + x.surname + "', address = '"
					+ x.address + "', phone = '" + x.phone + "', password = '" + x.password + "' WHERE id = " + x.id;
			System.out.println(query);
			// create the java statement
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			st.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}

	public static void deleteCustomer(CustomerDB x) {
		try {
			//String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			//Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			// our SQL SELECT query.
			String query = "DELETE FROM  customer  WHERE id = '" + x.id + "';";

			// create the java statement
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			st.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}
	
	public static boolean checkLogin(int id, String password)
	{
		try {
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			String query = "SELECT * FROM customer WHERE id = '"+id+"' AND password = '"+password+"'";

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
			GlobalData.CurrentCustomer_customerId =rs.getInt(1);
			GlobalData.CurrentCustomer_name= rs.getString(2);
			GlobalData.CurrentCustomer_surname= rs.getString(3);
			GlobalData.CurrentCustomer_address= rs.getString(4);
			GlobalData.CurrentCustomer_phone= rs.getString(5);
			GlobalData.CurrentCustomer_customerpassword= rs.getString(6);
			return true;
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return false;
	}

}
