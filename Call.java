import java.sql.*;
import java.util.Scanner;
class Call
{
	public static void main(String args[]) 
	{try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Loaded ");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce"
		,"IPC72","IPC72");
		CallableStatement s=con.prepareCall("call INSERTR(?,?)");
		//PreparedStatement s=con.prepareStatement("insert into student values(?,?)");
		Scanner sc=new Scanner(System.in);
		while(true)
		{ 
			System.out.println("Enter your roll no: ");
			int a=sc.nextInt();
			System.out.println("enter your name");
			String b=sc.next();
			s.setInt(1,a);
			s.setString(2,b);
			int i=s.executeUpdate();
			System.out.println(i);
			System.out.println("enter 1 if you insert new record");
			int op=sc.nextInt();
			if(op!=1)
			{
				break;
			}
			
		}
		

		
		System.out.println("success");
		}
		catch(Exception e)
		{
		  System.out.println(e);
		}
		
	}
}

