package tw.bcroom335.javaproject.practice;

public class P20CircleArea {
	public void calculate(double r) {
		System.out.println("Circle Area:"+(r*r*3.14));
	}

	public static void main(String[] args) {
		if(args.length>=1) {
			try {
				double myr=Double.parseDouble(args[0]);
				P20CircleArea calculate=new P20CircleArea();
				calculate.calculate(myr);
			    }catch(Exception e){
			    	System.out.println("e1:"+e);
			    	System.out.println("Please Insert correct number");			    	
			    }
			}else{
				System.out.println("Please Insert number");
		    }
	}
}
