package tw.bcroom335.javaproject.firstindependentstudy;

import java.io.IOException;
import java.sql.SQLException;
import org.json.JSONException;

public interface IEventDao {	
	public void add(Event e) throws SQLException;
	public void update(Event e) throws SQLException;
	public void delete(int id) throws SQLException;
	public Event Select(int id) throws SQLException;
	public void readJSON(String jsonString) throws JSONException,IOException;
	public void queryDbWithJson() throws SQLException,JSONException, IOException;
	public void creatconn() throws SQLException;
	public void closeconn() throws SQLException;
}
