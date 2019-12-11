package DATABASE;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;



	/*
	 *  JDBC��ȡ���ݱ�sort,ÿ�����ݷ�װ��Sort��Ķ�����
	 *  �ܶ��Sort�����,�洢��List������
	 */
	public class JDBCDEMOA {
		public static void main(String[] args) throws Exception{
			//ʹ��JDBC������,ֱ�ӻ�ȡ���ݿ����Ӷ���
			Connection con = JDBCUtils.getConnection();
			//���ӻ�ȡ���ݿ�SQL���ִ���߶���
			PreparedStatement pst = con.prepareStatement("SELECT * FROM users");
			//���ò�ѯ����,��ȡ�����
			ResultSet rs = pst.executeQuery();
			//�������϶���
			List<Sort> list = new ArrayList<Sort>();
			while(rs.next()){
				//��ȡ��ÿ��������,��װ��Sort������
				Sort s = new Sort(rs.getInt("uid"),rs.getString("uname"),rs.getString("uaddress"));
			    //��װ��Sort����,�洢��������
				list.add(s);
			}
			JDBCUtils.close(con, pst, rs);
			//����List����
			for(Sort s : list){
				System.out.println(s);
			}
		}
	}


