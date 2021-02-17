package M;

import java.sql.*;
import java.util.ArrayList;

import common.GlobalData;

public class CustomerManager
{
	public static ArrayList<CustomerDB> getAllCustomer()
	{
		ArrayList<CustomerDB> list = new ArrayList<CustomerDB>();
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
			String query = "SELECT * FROM customer";

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next())
			{
				int id = rs.getInt("id");
				String firstName = rs.getString("name");
				String lastName = rs.getString("surname");
				String phone = rs.getString("phone");

				CustomerDB cc = new CustomerDB(id, firstName, lastName, phone);
				list.add(cc);

				// print the results
				System.out.format("%d, %s, %s, %s \n", id, firstName, lastName, phone);
			}
			st.close();
		} catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return list;
	}

	public static void saveNewCustomer(CustomerDB x)
	{
		try
		{
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			// our SQL SELECT query.
			String query = "INSERT INTO customer VALUE (0, '" + x.name + "','" + x.surname + "','" + x.phone + "')";

			// create the java statement
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			st.close();
		} catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}

	public static void editCustomer(CustomerDB x)
	{
		try
		{
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			// our SQL SELECT query.
			String query = "UPDATE customer SET name = '" + x.name + "',  surname = '" + x.surname + "', phone = '"
					+ x.phone + "' WHERE id = " + x.id + ")";

			// create the java statement
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			st.close();
		} catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}
	

	public static void deleteCustomer(CustomerDB x)
	{
		try
		{
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD);

			// our SQL SELECT query.
			String query = "DELETE FROM  customer  WHERE id = " + x.id + " ";

			// create the java statement
			Statement st = conn.createStatement();

			st.executeUpdate(query);

			st.close();
		} catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}
	
	public static ArrayList<CustomerDB> searchCustomer(String s)
	{
		ArrayList<CustomerDB> list = new ArrayList<CustomerDB>();
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
			String query = "SELECT * FROM customer WHERE name LIKE '"+s+"' OR surname LIKE '"+s+"'";

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next())
			{
				int id = rs.getInt("id");
				String firstName = rs.getString("name");
				String lastName = rs.getString("surname");
				String phone = rs.getString("phone");

				CustomerDB cc = new CustomerDB(id, firstName, lastName, phone);
				list.add(cc);

				// print the results
				System.out.format("%d, %s, %s, %s \n", id, firstName, lastName, phone);
			}
			st.close();
		} catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return list;
	}

	public static void main(String[] args)
	{
		ArrayList<CustomerDB> ll = getAllCustomer();
		System.out.println(ll.size());

	}

}