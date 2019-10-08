package tw.bcroom335.javaproject.practice;

import java.io.File;
import java.io.IOException;

public class P29FileTest {

	public static void main(String[] args) throws IOException {
		File fl=new File("c:temp/test/hello.txt");
		boolean status = fl.exists();
		System.out.println("Status:"+status);
		
		if(status) {
			System.out.println("name:"+fl.getName());
			System.out.println("length:"+fl.length());
			System.out.println("Parent:"+fl.getParent());
			System.out.println("path:"+fl.getPath());
			
			fl.delete();
			System.out.println("File has deleted.");
		}else {
			fl.createNewFile();
			System.out.println("File has created.");
		}

	}

}
