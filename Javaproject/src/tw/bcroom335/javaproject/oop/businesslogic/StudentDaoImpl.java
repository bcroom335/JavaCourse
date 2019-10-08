package tw.bcroom335.javaproject.oop.businesslogic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import tw.bcroom335.javaproject.oop.jdbc.TestJdbcDatasource;

public class StudentDaoImpl implements IStudentDao{
		
	private TestJdbcDatasource daoJdbc;
	private Connection conn;

	public StudentDaoImpl() throws IOException {
		 daoJdbc=new TestJdbcDatasource();		
	}

	@Override
	public void add(Student stu) throws SQLException {
		String sqlstr="Insert Into Student(name,course)Values(?,?)";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setString(1, stu.getName());
		state.setString(2, stu.getCourse());
		state.executeUpdate();
		state.close();
		System.out.println("Add Sucessed.");
	}

	@Override
	public void update(Student stu) throws SQLException {
		String sqlstr = "Update student Set name=? Where id=? and course=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setString(1, stu.getName());
		state.setInt(2, stu.getID());
		state.setString(3, stu.getCourse());
		state.executeUpdate();
		state.close();
		System.out.println("update success.");
	}

	@Override
	public void delete(int id) throws SQLException {
		String sqlstr = "Delete From student Where id=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setInt(1, id);
		state.execute();
		state.close();
		System.out.println("delete success.");
	}

	@Override
	public Student FindById(int id) throws SQLException {
		Student s = null;
		String sqlstr = "Select * From student Where id=?";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		state.setInt(1, id);
		ResultSet rs = state.executeQuery();
		if (rs.next()) {
			s = new Student();
			s.setID(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setCourse(rs.getString(3));
		}
		rs.close();
		state.close();
		return s;
	}

	@Override
	public void creatconn() throws SQLException {
		conn=daoJdbc.getConnection();
		System.out.println("Status:"+!conn.isClosed());
	}

	@Override
	public void closeconn() throws SQLException {
		daoJdbc.connclose();
	}
	
	@Override
	public void queryDbWithJson() throws SQLException, JSONException {
		String sqlstr = "Select * From student";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		ResultSet rs = state.executeQuery();
		
		JSONArray jArray=new JSONArray();
		
		while(rs.next()) {
			JSONObject jObject=new JSONObject();			
			jObject.put("id", rs.getInt(1));
			jObject.put("name", rs.getString(2));
			jObject.put("course", rs.getString(3));
			
			jArray.put(jObject);
		}
		
		String jsonString=jArray.toString();
		System.out.println("jsonString:"+jsonString);
		
		if(jArray!=null && jArray.length()!=0) {
			for(int i=0;i<jArray.length();i++){
				JSONObject Object = jArray.getJSONObject(i);
				int id=Object.getInt("id");
				String name=Object.getString("name");
				String course=Object.getString("course");
				System.out.print("id:"+id);
				System.out.print(" name:"+name);
				System.out.println(" course:"+course);
			}
			
		}
		
		rs.close();
		state.close();
	}

}
