package tw.bcroom335.javaproject.oop.io;

import java.io.File;
import java.io.IOException;

public class TestFileEx1 {

	public static void main(String[] args) throws IOException {
		File file1=new File("C:/temp/test/hello.txt");
		boolean status=file1.exists();
		System.out.println("status:"+status);
		
		if(status) {			
			System.out.println("name:"+file1.getName());
			System.out.println("length:"+file1.length());
			System.out.println("parent:"+file1.getParent());
			System.out.println("path:"+file1.getPath());
			
			file1.delete();
			System.out.println("File has deleted.");
		}else {
			file1.createNewFile();
			System.out.println("File has created.");
		}
		

	}

}
