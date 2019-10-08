package tw.bcroom335.javaproject.practice;

public class P10NumberSort {
	int[] data= {99,25,36,4,48,7};
	
	public void numbersort1(){
		for(int i=0;i<data.length-1;i++) {
			for(int j=i+1;j<data.length;j++) {
				int temp=0;
				if(data[i]>data[j]) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;					
				}		
			}
		}
	}
	
	public void numbersort2() {
		while(true) {
			int count=0;
			for(int i=0;i<data.length-1;i++) {				
				if(data[i]>data[i+1]) {
					int temp=0;
					temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
					count++;
				}
			}
			if(count==0) {
				break;
			}
		}
	}
	
	public void printresult() {
		for(int k=0;k<data.length;k++) {
			System.out.printf("data[%d]=%d\n",k,data[k]);
		}
	}
	
	public static void main(String[] args) {
		P10NumberSort sort1=new P10NumberSort();
		sort1.numbersort2();
		sort1.printresult();
		
	}

}
