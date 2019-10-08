package tw.bcroom335.javaproject.oop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallTestJdbcConnectionEx1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");      
		String urlsql="jdbc:sqlserver://localhost:1433;databasename=CCDataBase;user=sa;password=passw0rd";
		
		Connection conn = DriverManager.getConnection(urlsql);
		
		boolean status = !conn.isClosed();
		System.out.println("Status:"+status);
		
		Statement state = conn.createStatement();
		String sqlstr="Select * From Profile";
		ResultSet rs = state.executeQuery(sqlstr);
		
		while(rs.next()) {
			System.out.println(rs.getInt("User_ID"));
			System.out.println(rs.getString("User_Name"));
			System.out.println(rs.getString("User_Address"));
			System.out.println(rs.getString(4));
			System.out.println(rs.getDate("User_Birthday"));
			System.out.println("-------------");
			//System.out.println(rs.getInt(5));
		}
		rs.close();
		state.close();
		conn.close();

	}

}
