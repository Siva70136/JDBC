<%@ page import="java.sql.*"%>
<%
  String name=request.getParameter("n1");
  String phno=request.getParameter("n2");
  String pwd=request.getParameter("p");
 try{
	Connection c=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	 c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC70","IPC70");
	String s ="insert into login values(?,?,?)";
	PreparedStatement p=c.prepareStatement(s);
	p.setString(1,name);
	p.setString(2,phno);
	p.setString(3,pwd);
	int m=p.executeUpdate();
	out.print("row updated");
    }
 catch(Exception e)
  {
	out.print(e);
	e.printStackTrace();
}
%>
