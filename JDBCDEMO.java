package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCDEMO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mybase";
		String username = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, username, password);
		//System.out.println(con);
		
		Statement stat = con.createStatement();
		String sql="select * from users";
		
 		int row=stat.executeUpdate("UPDATE users SET uname='Allen', uaddress = 'street 300' WHERE uid=1");
//		System.out.println(row);
		
		ResultSet rs=stat.executeQuery(sql);
		
		while(rs.next()){
			System.out.println(rs.getInt("uid")+"   "+rs.getString("uname"));		
		}
		
		rs.close();
		stat.close();
		con.close();

	}

}
