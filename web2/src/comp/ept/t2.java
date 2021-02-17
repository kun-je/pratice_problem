package comp.ept;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class t2
 */
@WebServlet("/t2")
public class t2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public t2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name, surname, phone;
		name = request.getParameter("name");
		surname = request.getParameter("surname");
		phone = request.getParameter("phone");

		java.sql.Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:8889/test";
		String user = "ED_Garden";
		String password = "";

		try {
			con = DriverManager.getConnection(url, user, password);
			Statement st = (Statement) con.createStatement();
			String sql = "INSERT INTO customer2 " + "VALUES (0, '"+name+"', '"+surname+"', '"+phone+"')";
			System.out.println(sql);
			st.executeUpdate(sql);

			con.close();
		}

		catch (SQLException ex) {
			ex.printStackTrace();

		}
	}

}
