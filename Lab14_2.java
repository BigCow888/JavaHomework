import java.sql.*;

public class Lab14_2 {

	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/stu_info?useSSL=false&serverTimezone=UTC","root","074314");
			System.out.println("���ӳɹ���");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab14_2 renewal=new Lab14_2();
		con=renewal.getConnection();
		try {
			sql=con.prepareStatement("select*from stu_info1");
			res=sql.executeQuery();
			System.out.println("ִ�����ӡ��޸ġ�ɾ��ǰ���ݣ�");
			while(res.next())
			{
				String id=res.getString("stu_ID");
				String name=res.getString("stu_name");
				String sex=res.getString("stu_sex");
				System.out.println("��ţ�"+id);
				System.out.println("������"+name);
				System.out.println("�Ա�"+sex);
				
			}
			
			sql=con.prepareStatement("insert into stu_info1"+" values(?,?,?)");
			sql.setObject(1,"20182005777");
			sql.setObject(2, "������");
			sql.setObject(3, "male");
			sql.executeUpdate();
			sql=con.prepareStatement("insert into stu_info1"+" values(?,?,?)");
			sql.setObject(1,"20182005666");
			sql.setObject(2, "������");
			sql.setObject(3, "male");
			sql.executeUpdate();
			sql=con.prepareStatement("update stu_info1 set stu_sex=? where stu_ID=20182005262");
			sql.setObject(1, "male");
			sql.executeUpdate();
			sql.executeUpdate("delete from stu_info1 where stu_id=20182005777");
			sql.executeUpdate();
			System.out.println("ִ�к�����ݣ�");
			sql=con.prepareStatement("select*from stu_info1");
			res=sql.executeQuery();
			while(res.next())
			{
				String id=res.getString("stu_ID");
				String name=res.getString("stu_name");
				String sex=res.getString("stu_sex");
				System.out.println("��ţ�"+id);
				System.out.println("������"+name);
				System.out.println("�Ա�"+sex);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
