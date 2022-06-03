<%@ page import="java.sql.*"%>
<%
  String name=request.getParameter("n1");
 try{
	Connection c=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	 c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC70","IPC70");
	String s ="select * from login where name=?";
	PreparedStatement p=c.prepareStatement(s);
	p.setString(1,name);
	ResultSet rs=p.executeQuery();
	while(rs.next())
	{
	  out.println(rs.getString(2));
	  out.println(rs.getString(3));
	}
    }
 catch(Exception e)
  {
	out.print(e);
	e.printStackTrace();
}
%>
