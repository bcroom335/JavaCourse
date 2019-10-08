package tw.bcroom335.javaproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStreamFileEx1 {

	public static void main(String[] args) throws IOException {
//		FileReader fr1=new FileReader("c:/temp/test/source.txt");
//		BufferedReader br1=new BufferedReader(fr1);
		BufferedReader br2=new BufferedReader(new FileReader("c:/temp/test/source.txt"));
		BufferedWriter bw1=new BufferedWriter(new FileWriter("c:/temp/test/bwrite1.txt"));
		
		String data;
		while((data=br2.readLine())!=null) {
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();
		}
		bw1.flush();
		bw1.close();
		br2.close();
	}

}
