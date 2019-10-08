package tw.bcroom335.javaproject.oop.businesslogic;

import java.io.IOException;
import java.sql.SQLException;

import org.json.JSONException;

public class CallTestStudentDaoImp {

	public static void main(String[] args) throws IOException, SQLException, JSONException {
//		StudentDaoImpl imp=new StudentDaoImpl();
//		imp.creatconn();				
		StudentDaoImpl sDao = StudentDaoFactory.creatStudentDao();
		sDao.creatconn();
//		Student stu1=new Student();		
//		stu1.setName("Mustang");
//		stu1.setCourse("fire");
//		sDao.add(stu1);
		sDao.queryDbWithJson();
		
//		imp.add(stu1);
		
//		stu1.setName("Wendy");
//		stu1.setID(4);;
//		stu1.setCourse("Mechanical");
//		sDao.update(stu1);
		
//		imp.delete(3);
//		sDao.delete(3);
		
//		Student s = imp.FindById(7);
//		System.out.println("id:" + s.getID());
//		System.out.println("name:" + s.getName());
//		System.out.println("course:" + s.getCourse());
//		Student s=sDao.FindById(1);
//		System.out.println("Id:"+s.getID());
//		System.out.println("Name:"+s.getName());
//		System.out.println("Course:"+s.getCourse());
		sDao.closeconn();
//		imp.closeconn();

	}

}
