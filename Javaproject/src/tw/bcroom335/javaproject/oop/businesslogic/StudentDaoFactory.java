package tw.bcroom335.javaproject.oop.businesslogic;

import java.io.IOException;

public class StudentDaoFactory {
	public static StudentDaoImpl creatStudentDao() throws IOException {
		StudentDaoImpl dao=new StudentDaoImpl();
		return dao;
	}
}
