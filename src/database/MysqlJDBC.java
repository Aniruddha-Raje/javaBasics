/**
 * 
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Aniruddha.Raje
 *
 */

/*
Steps to connect to a database in java?
1. Registering the driver class
2. Creating connection
3. Creating statement
4. Executing queries
5. Closing connection
*/
//Statement - used to execute normal SQL queries. You can’t pass the parameters
//PreparedStatement - used to execute dynamic or parameterized SQL queries
//CallableStatement - used to execute the stored procedures
//ResultSet object represents a row of a table.
public class MysqlJDBC {
	public static void main(String args[]) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
			// here sonoo is database name, root is username and password
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
