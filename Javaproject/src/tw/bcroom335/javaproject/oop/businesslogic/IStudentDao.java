package tw.bcroom335.javaproject.oop.businesslogic;

import java.sql.SQLException;
import org.json.JSONException;

public interface IStudentDao {
	public void add(Student stu) throws SQLException;
	public void update(Student stu) throws SQLException;
	public void delete(int id) throws SQLException;
	public Student FindById(int id) throws SQLException;
	public void queryDbWithJson() throws SQLException,JSONException;
	public void creatconn() throws SQLException;
	public void closeconn() throws SQLException;
	
}
