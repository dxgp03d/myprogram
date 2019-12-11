package DATABASE;

import javax.activation.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils1 {
	private static BasicDataSource datasource =new BasicDataSource();
	
	static{
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/mybase");
		datasource.setUsername("root");
		datasource.setPassword("123");
		datasource.setInitialSize(10);
		datasource.setMaxIdle(1);
	}

	public static BasicDataSource getDataSource(){
		return datasource;
		
	}
}
