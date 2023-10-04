package demo;

public class fibonacci_series {
public static void main(String[] args) {
//	int a = 1;
//	int b = 0;
//	
//	int sum = 0;
//	
//	for(int i=1; i<=5; i++) {
//		sum=a+b;  //1+0  1+1=2   2+1    3+2
//		b=a;      //1    1       2      3
//		a=sum;    //1	 2       3      5
//		
//		System.out.println(sum);
//	}
	
	
	
	
	
	
	int a = 1;
	int b =0;
	
	int sum = 0;
	
	for(int i=1; i<=5; i++) {
		sum=a+b;
		b=a;
		a=sum;
		
		System.out.println(sum);
	}
	
}
}
