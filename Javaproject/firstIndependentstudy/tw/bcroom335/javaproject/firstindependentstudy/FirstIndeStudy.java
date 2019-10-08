package tw.bcroom335.javaproject.firstindependentstudy;

public class FirstIndeStudy {
	
	public static void main(String[] args) throws Exception {
		EventDaoImpl impl=new EventDaoImpl();
		impl.creatconn();
			
//		Event e1=new Event();
//		e1.setID(22014);
//		e1.setShowGroupName("藝遊未境兒童藝術教育機構");
//		e1.setEventName("藝術派對夏令營SUMMERCAMPFOR2019");
//		e1.setDurationStart("2019-07-01");
//		e1.setdtEnd("2019-08-25");
//		e1.setlatitude((float)25.0441599);
//		e1.setlongitude((float)121.52744);
//		impl.add(e1);
		
		
//		Event e2=new Event();
//		e2.setdtEnd("2049-08-08");
//		e2.setID(22014);
//		impl.update(e2);
//			
//		impl.delete(22014);

//		Event e3=impl.Select(22014);
//		System.out.println("ID:"+e3.getID());
//		System.out.println("ShowGroupName:"+e3.getShowGroupName());
//		System.out.println("EventName:"+e3.getEventName());
//		System.out.println("DurationStart:"+e3.getDurationStart());
//		System.out.println("dtEnd:"+e3.getdtEnd());
//		System.out.println("latitude:"+e3.getlatitude());
//		System.out.println("longitude:"+e3.getlongitude());
		
		impl.readJSON("https://data.taipei/opendata/datalist/apiAccess?scope=resourceAquire&rid=cf6540e6-4df2-4afa-a71c-c6efdf62318d");
		
//		impl.queryDbWithJson();
		
		impl.closeconn();
	}

}
