package tw.bcroom335.javaproject.oop.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStreamFileIOEX1 {

	public static void main(String[] args) throws IOException {
		FileReader fr1=new FileReader("c:/temp/test/source.txt");
		//FileWriter fw1=new FileWriter("c:/temp/test/write1.txt");
		FileWriter fw1=new FileWriter("c:/temp/test/write1.txt",true);
		int data;
		while((data=fr1.read())!=-1) {
			System.out.print((char)data);
			fw1.write(data);
			
		}
		fw1.close();
		fr1.close();
		
	}

}
