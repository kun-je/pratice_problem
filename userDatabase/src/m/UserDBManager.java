package m;

import java.util.ArrayList;

import common.GlobalData;

import java.sql.*;

public class UserDBManager
{
	public static ArrayList<UserDB> getAllUsers()
	{
		ArrayList<UserDB> list = new ArrayList<UserDB>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/" + GlobalData.DatabaseName;
		String user = GlobalData.DatabaseUser;
		String password = GlobalData.DatabasePassword;

		try
		{
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM users");
			while (rs.next())
			{
				UserDB x = new UserDB();
				x.id = rs.getInt(1);
				x.Username = rs.getString(2);
				x.Password = rs.getString(3);
				x.UserType = rs.getString(4);

				list.add(x);

			}

		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (st != null)
				{
					st.close();
				}
				if (con != null)
				{
					con.close();
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();

			}

		}
		return list;

	}
	public static void addNewUser(UserDB x)
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/" + GlobalData.DatabaseName;
		String user = GlobalData.DatabaseUser;
		String password = GlobalData.DatabasePassword;

		try
		{
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			int i  = st.executeUpdate("INSERT INTO users VALUES (0,'"+x.Username+"','"+x.Password+"','"+x.UserType+"')");
			
			

		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (st != null)
				{
					st.close();
				}
				if (con != null)
				{
					con.close();
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();

			}

	}

}
	
	public static void updateUser(UserDB x)
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/" + GlobalData.DatabaseName;
		String user = GlobalData.DatabaseUser;
		String password = GlobalData.DatabasePassword;

		try
		{
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			int i  = st.executeUpdate("UPDATE users SET " +
										"username = '"+x.Username+"'"+
									" , password = '"+x.Password+"'"+ 
									" ,usertype '"+x.UserType+"'" +
									"  WHERE id = " +x.id );
			
			

		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (st != null)
				{
					st.close();
				}
				if (con != null)
				{
					con.close();
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();

			}

	}

}
	
	
	public static void deleteUser(UserDB x)
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/" + GlobalData.DatabaseName;
		String user = GlobalData.DatabaseUser;
		String password = GlobalData.DatabasePassword;

		try
		{
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			int i  = st.executeUpdate("Delete FROM users SET "+
									"  WHERE id = " +x.id );
			
			

		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (st != null)
				{
					st.close();
				}
				if (con != null)
				{
					con.close();
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();

			}

	}

}
}

