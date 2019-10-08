package tw.bcroom335.javaproject.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class P32BtyetoCharStream {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/record.txt")));
		System.out.println("Please Type anything press Q to quit.");
		
		String data;
		while((data=br.readLine())!=null) {
			if("Q".equalsIgnoreCase(data)) {
				System.out.println("Thank you!");
				break;
			}
			System.out.println(data);
			bw.write(data);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
