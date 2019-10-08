package tw.bcroom335.javaproject.flowcontrol.loop;

public class TestWhileloopEx2 {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
        while(i<=10) {
        	sum=sum+i;
        	//累加,給予Sum一個額外暫存記憶
        	i++;
        }
        System.out.print("Sum="+sum);
        
	}

}
