package tw.bcroom335.javaproject.oop.exception;

import java.util.Calendar;
import java.util.Date;

class ExceptionEx3{
	public void processAction(Date date) throws NullPointerException,Exception{
		long myTime=date.getTime();
		System.out.println("myTime:"+myTime);
		System.out.println("Date:"+date);
		
		Calendar c1=Calendar.getInstance();
		int year=c1.get(Calendar.YEAR);
		int month=c1.get(Calendar.MONTH)+1;
		int day=c1.get(Calendar.DAY_OF_MONTH);
		System.out.printf("%d/%d/%d",year,month,day);
	}
	
}

public class TestExceptionEx3 {

	public static void main(String[] args) {
		ExceptionEx3 excep3=new ExceptionEx3();
		try{
			//excep3.processAction(null);
			excep3.processAction(new Date());
		}catch (NullPointerException e) {
			System.out.println("e1"+e);
		}catch(Exception e) {
			System.out.println("e2"+e);
		}

	}

}
