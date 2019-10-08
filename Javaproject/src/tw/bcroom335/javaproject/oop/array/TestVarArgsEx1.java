package tw.bcroom335.javaproject.oop.array;

public class TestVarArgsEx1 {
	public void plus(int...numbers) {//<=>int[] numbers = serials;
		int total=0;
		for(int value:numbers) {
			total=total+value;
		}
		System.out.println("total:"+total);	
	}	
	
	public static void main(String[] args) {
		TestVarArgsEx1 varArgs=new TestVarArgsEx1();
		varArgs.plus(1,2,3);
		varArgs.plus();
		
		int[] serials={1,2,3,4,5,6,7,8,9,10};
		varArgs.plus(serials);		
	}

}
