package tw.bcroom335.javaproject.Lab;

public class HighestCommonFactor {
	public static void main(String[] args) {  
		  //demo1
		  System.out.println(gcd(18,12));
		  //demo2
		  System.out.println(gcd2(7,49));  
		 }

		 public static int gcd(int m, int n){
		  int result = 1;
		  while(m%n!=0){
		   result=n;   
		   n=m%n;
		   m=result;
		  }
		  result=n;
		  return result;
		 }
		 public static int gcd2(int m, int n){
		  if(m%n==0){
		   return n;
		  } else {
		   return gcd2(n,m%n);
		  }  
		 } 

}
