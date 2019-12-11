package DATABASE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBCUtils {
	public static void main(String[] args)throws Exception {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM users");
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("uid")+" "+rs.getString("uname"));
		}
		JDBCUtils.close(con, pst, rs);
		
		/*List list = new XXXX()
		 * while(rs.next()){
			Sort s = new Sort(rs.getInt("")......);
			list.add(s);
		}
		 * */
	}
}
