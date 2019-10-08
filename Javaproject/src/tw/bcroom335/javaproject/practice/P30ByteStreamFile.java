package tw.bcroom335.javaproject.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P30ByteStreamFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1=new FileInputStream("c:/temp/test/info.txt");
		FileOutputStream fos1=new FileOutputStream("c:/temp/test/copyinfo.txt");
		
		int data;
		while((data=fis1.read())!=-1) {
			System.out.print((char)data);
			fos1.write(data);
		}
		fos1.close();
		fis1.close();
	}

}
