package tw.bcroom335.javaproject.firstindependentstudy;

public class Event {
	private int ID;
	private String ShowGroupName,EventName,DurationStart,dtEnd;
	private float latitude,longitude;
	
	public int getID(){
		return ID;
	}
	
	public void setID(int id) {
		ID = id;
	}
	
	public String getShowGroupName(){
		return ShowGroupName;
	}
	
	public void setShowGroupName(String shn) {
		ShowGroupName = shn;
	}
	
	public String getEventName(){
		return EventName;
	}
	
	public void setEventName(String en) {
		EventName = en;
	}
	public String getDurationStart(){
		return DurationStart;
	}
	
	public void setDurationStart(String ds) {
		DurationStart = ds;
	}
	public String getdtEnd(){
		return dtEnd;
	}
	
	public void setdtEnd(String dt) {
		dtEnd = dt;
	}
	
	public float getlatitude(){
		return latitude;
	}
	
	public void setlatitude(float lat) {
		latitude = lat;
	}
	public float getlongitude(){
		return longitude;
	}
	
	public void setlongitude(float lot) {
		longitude = lot;
	}
	
	public Event() {
		// TODO Auto-generated constructor stub
	}

}
