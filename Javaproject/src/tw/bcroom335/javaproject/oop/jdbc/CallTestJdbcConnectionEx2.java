package tw.bcroom335.javaproject.oop.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallTestJdbcConnectionEx2 {
		
		private Connection conn;
		
		public void startconn() throws Exception {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");      
			String urlsql="jdbc:sqlserver://localhost:1433;databasename=CCDataBase;user=sa;password=passw0rd";
			
			conn = DriverManager.getConnection(urlsql);
			
			boolean status = !conn.isClosed();
			System.out.println("Status:"+status);
		}
		
		public void sqlQuery() throws SQLException {
			Statement state = conn.createStatement();
			String sqlstr="Select * From Profile";
			ResultSet rs = state.executeQuery(sqlstr);
			
			while(rs.next()) {
				System.out.println("User_ID\tUser_Name\tUser_Address\tUser_Phone\tUser_Birthday");
				System.out.print(rs.getInt("User_ID")+"\t");
				System.out.print(rs.getString("User_Name")+"\t\t");
				System.out.print(rs.getString("User_Address")+"\t\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println(rs.getDate("User_Birthday"));
				System.out.println("--------------------------------------");
			}
			rs.close();
			state.close();		
		}
		
		public static void main(String[] args){
			CallTestJdbcConnectionEx2 test=new CallTestJdbcConnectionEx2();
			try {
				test.startconn();
				
				//test.sqlQuery();
				//test.insetDb();
				//test.updateDb();
				//test.deleteDb();
				//test.sqlQuery();
				test.actionstoreprocedure();
				
				test.closeconn();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void insetDb() throws SQLException {
			String sqlstr="Insert Into Profile(User_Name,User_Address,User_Phone,User_Birthday)Values(?,?,?,?)";
			PreparedStatement state = conn.prepareStatement(sqlstr);
			state.setString(1, "Olivar");
			state.setString(2, "UK");
			state.setString(3, "N/A");
			state.setString(4, "1967-12-24");

			int count = state.executeUpdate();
			System.out.println("count:"+count);
			state.close();
			
			
		}
		
		public void updateDb() throws SQLException {
			String sqlstr="Update Profile Set User_Phone= ? Where User_address= ?";
			PreparedStatement state = conn.prepareStatement(sqlstr);
			state.setString(1, "0912345678");
			state.setString(2,"NY");
			state.executeUpdate();
			state.close();
			System.out.println("Update Success.");
		}
		
		public void deleteDb() throws SQLException {
			String sqlstr="Delete From Profile Where User_ID=?";
			PreparedStatement state = conn.prepareStatement(sqlstr);
			state.setInt(1, 12);
			state.executeUpdate();
			state.close();
			System.out.println("Delete Success.");
		}
		
		public void actionstoreprocedure() throws SQLException {
			CallableStatement state = conn.prepareCall("{call myprofileproc(?,?)}");
			state.registerOutParameter(2, java.sql.Types.NVARCHAR);
			state.setInt(1, 11);
			state.execute();
			System.out.println("Store procedure name:"+state.getString(2));
			state.close();
		}

		public void closeconn() throws SQLException {
		conn.close();
		}

}
