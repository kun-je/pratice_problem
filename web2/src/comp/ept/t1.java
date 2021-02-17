package comp.ept;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class t1
 */
@WebServlet("/t1")
public class t1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public t1() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<h1> hello </h1>");
		
		try
	    {
			//String url = "jdbc:mysql://localhost/test";
			
	      // create our mysql database connection
	    //String myDriver = "org.gjt.mm.mysql.Driver";
	     String myUrl = "jdbc:mysql://localhost/test";
	    Class.forName("org.gjt.mm.mysql.Driver");
	      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	      
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT * FROM customer2";

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
	     
	        
	        // print the results
	        pw.format("%d, %s, %s, %s<br /> \n", id, firstName, lastName, phone);
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
