package DATABASE;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;



	/*
	 *  JDBC读取数据表sort,每行数据封装到Sort类的对象中
	 *  很多个Sort类对象,存储到List集合中
	 */
	public class JDBCDEMOA {
		public static void main(String[] args) throws Exception{
			//使用JDBC工具类,直接获取数据库连接对象
			Connection con = JDBCUtils.getConnection();
			//连接获取数据库SQL语句执行者对象
			PreparedStatement pst = con.prepareStatement("SELECT * FROM users");
			//调用查询方法,获取结果集
			ResultSet rs = pst.executeQuery();
			//创建集合对象
			List<Sort> list = new ArrayList<Sort>();
			while(rs.next()){
				//获取到每个列数据,封装到Sort对象中
				Sort s = new Sort(rs.getInt("uid"),rs.getString("uname"),rs.getString("uaddress"));
			    //封装的Sort对象,存储到集合中
				list.add(s);
			}
			JDBCUtils.close(con, pst, rs);
			//遍历List集合
			for(Sort s : list){
				System.out.println(s);
			}
		}
	}


