package tw.bcroom335.javaproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteCounvertCharStreamIOEX1 {

	public static void main(String[] args) throws IOException {
//		InputStream is1=System.in;
//		InputStreamReader isr1=new InputStreamReader(is1);
//		BufferedReader br1=new BufferedReader(isr1);
		
		System.out.println("Please Input your name. press Q to exit");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/record.txt")));
		
		String data;
		while((data=br1.readLine())!=null) {
			if("Q".equalsIgnoreCase(data)) {
				System.out.println("System Exit");
				break;
			}
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();
		}
		bw1.flush();
		bw1.close();
		br1.close();

	}

}
