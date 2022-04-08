import java.sql.*;
import java.util.Scanner;
class Demo3
{
	public static void main(String args[]) 
	{try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Loaded ");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce"
		,"IPC72","IPC72");
		PreparedStatement s=con.prepareStatement("select * from student");
		Scanner sc=new Scanner(System.in);
		ResultSet rs=s.executeQuery();
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

