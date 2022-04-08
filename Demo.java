import java.sql.*;
class Demo
{
	public static void main(String args[]) 
	{try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Loaded ");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce"
		,"IPC72","IPC72");
		Statement s=con.createStatement();
		String sql=" delete from student where id=73";
		s.executeUpdate(sql);
		ResultSet rs=s.executeQuery("select * from student");
		while(rs.next())
		{ 
			System.out.println("id : "+rs.getInt(1)+"   name: "+rs.getString(2));
		}
		System.out.println("success");
		}
		catch(Exception e)
		{
		  System.out.println(e);
		}
	}
}