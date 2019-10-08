package tw.bcroom335.javaproject.firstindependentstudy;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EventDaoImpl implements IEventDao {

	private ConnSQLServer daojdbc;
	private Connection conn;

	public EventDaoImpl() throws Exception {
		daojdbc = new ConnSQLServer();
	}

	@Override
	public void add(Event e) throws SQLException {
		String sqlstr1 = "Insert Into taipeicultureinfo(ID,ShowGroupName,EventName,DurationStart,dtEnd,latitude,longitude)values(?,?,?,?,?,?,?)";
		PreparedStatement state1 = conn.prepareStatement(sqlstr1);
		state1.setInt(1, e.getID());
		state1.setString(2, e.getShowGroupName());
		state1.setString(3, e.getEventName());
		state1.setString(4, e.getDurationStart());
		state1.setString(5, e.getdtEnd());
		state1.setFloat(6, e.getlatitude());
		state1.setFloat(7, e.getlongitude());
		state1.executeUpdate();
		state1.close();
		System.out.println("add success");
	}

	@Override
	public void update(Event e) throws SQLException {
		String sqlstr2 = "update taipeicultureinfo set dtEnd=? where id=?";
		PreparedStatement state2 = conn.prepareStatement(sqlstr2);
		state2.setString(1, e.getdtEnd());
		state2.setInt(2, e.getID());
		state2.executeUpdate();
		state2.close();
		System.out.println("update success.");
	}

	@Override
	public void delete(int id) throws SQLException {
		String sqlstr3 = "delete from taipeicultureinfo where id=?";
		PreparedStatement state3 = conn.prepareStatement(sqlstr3);
		state3.setInt(1, id);
		state3.executeUpdate();
		state3.close();
		System.out.println("delete success.");
	}

	@Override
	public Event Select(int id) throws SQLException {
		Event e = null;
		String sqlstr4 = "select * from taipeicultureinfo where ID=?";
		PreparedStatement state4 = conn.prepareStatement(sqlstr4);
		state4.setInt(1, id);
		ResultSet rs = state4.executeQuery();
		if (rs.next()) {
			e = new Event();
			e.setID(rs.getInt(1));
			e.setShowGroupName(rs.getString(2));
			e.setEventName(rs.getString(3));
			e.setDurationStart(rs.getString(4));
			e.setdtEnd(rs.getString(5));
			e.setlatitude(rs.getFloat(6));
			e.setlongitude(rs.getFloat(7));
		}
		rs.close();
		state4.close();
		return e;
	}

	@Override
	public void creatconn() throws SQLException {
		conn = daojdbc.getConnection();
		boolean status = !conn.isClosed();
		if (status) {
			System.out.println("log in");
		} else {
			System.out.println("log failure");
		}
	}

	@Override
	public void closeconn() throws SQLException {
		daojdbc.connclose();
	}

	@Override
	public void queryDbWithJson() throws SQLException, JSONException, IOException {
		String sqlstr = "select * from taipeicultureinfo";
		PreparedStatement state = conn.prepareStatement(sqlstr);
		ResultSet rs = state.executeQuery();

		JSONArray jArray = new JSONArray();

			while (rs.next()) {
		
			JSONObject jObject = new JSONObject();
			jObject.put("Id", rs.getInt(1));
			jObject.put("ShowGroupName", rs.getString(2));
			jObject.put("EventName", rs.getString(3));
			jObject.put("DurationStart", rs.getString(4));
			jObject.put("dtEnd", rs.getString(5));
			jObject.put("latitude", rs.getFloat(6));
			jObject.put("longitude", rs.getFloat(7));

			jArray.put(jObject);
			}

		String jsonString = jArray.toString();
		System.out.println(jsonString);
		FileWriter fw1 = new FileWriter("c:/temp/test.json");
		fw1.write(jsonString);
		System.out.println("File Output Sucess.");

		fw1.close();
//		try {
//			FileReader fr1=new FileReader(jsonString);
//			FileWriter fw1=new FileWriter("c:/temp/test.json");
//			int data;
//			while((data=fr1.read())!=-1){
//				System.out.print((char)data);
//				fw1.write(data);
//			}		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

	}

	@Override
	public void readJSON(String jsonString) throws JSONException, IOException {
		URL myurl=new URL(jsonString);
		URLConnection uc = myurl.openConnection();
		BufferedReader in=new BufferedReader(new InputStreamReader(uc.getInputStream(),"utf-8"));
		String str=in.readLine();
		System.out.println(str);
		
	}

}
