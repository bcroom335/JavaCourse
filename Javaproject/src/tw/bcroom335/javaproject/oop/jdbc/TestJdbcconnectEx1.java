package tw.bcroom335.javaproject.oop.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestJdbcconnectEx1 {
	private TestJdbcDatasource jdbc2;
	private Connection conn;
	private ArrayList<String> names;

	public TestJdbcconnectEx1() throws IOException, SQLException {
		jdbc2=new TestJdbcDatasource();
		conn=jdbc2.getConnection();
		boolean status = !conn.isClosed();
		System.out.println("status:"+status);		
	}
	
	public void verified(String user,String pwd) throws SQLException {
		String sqlstr="Select * from members where username=? and password=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setString(1, user);
		state.setString(2, pwd);
		
		ResultSet rs = state.executeQuery();
		boolean checkstatus = rs.next();
		
		if(checkstatus) {
			System.out.println("Login Success~~");
		}else {
			System.out.println("Try again");
		}
		rs.close();
		state.close();
	}
	
	public void queryDb() throws SQLException {
		String sqlstr="select * from profile";
		Statement state = conn.createStatement();
		ResultSet rs = state.executeQuery(sqlstr);
		
		names=new ArrayList<String>();
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String Address=rs.getString(3);
			String Phone=rs.getString(4);
			
			System.out.print("Id:"+id);
			System.out.print(" name:"+name);
			System.out.print(" Address:"+Address);
			System.out.println(" Phone:"+Phone);
			
			names.add(name);
		}
		System.out.println(names);
		state.close();
	}
	
	public void insertDbBatch() throws SQLException {
		Statement state = conn.createStatement();
		for(int i=0;i<names.size();i++) {
			String username = names.get(i);
			String userpwd = "cc_system_"+(int)(Math.random()*10000000)+1;
			state.addBatch("Insert Into members(username,password)values('"+username+"','"+userpwd+"')");
		}
		int[] rows=state.executeBatch();
		state.close();
		System.out.println("Length1:"+rows.length);
	}
	
	public void insertDbPreparedstateBatch() throws SQLException {
		String sqlstr="Insert Into members(username,password)values(?,?)";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		for(String nickname:names) {
		state.setString(1, nickname);
		state.setString(2,"kk_system_"+(int)(Math.random()*10000000)+1);
		state.addBatch();
		}
		int[] rows=state.executeBatch();
		state.close();
		System.out.println("length2:"+rows.length);
	}
	
	public void close() throws SQLException {
		jdbc2.connclose();
	}
	

	public static void main(String[] args) throws IOException, SQLException {
		TestJdbcconnectEx1 test1=new TestJdbcconnectEx1();
		
		//test1.verified("Lin", "1234");
		//test1.verified("sky001tp", "123456");
		test1.queryDb();
		//test1.insertDbBatch();
		test1.insertDbPreparedstateBatch();
		
		test1.close();

	}

}
