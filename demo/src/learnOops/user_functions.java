package learnOops;


public class user_functions {}

//there are two types of function:-
//1. predefined function
//2. user function
	
//1: User Function


//class Demo{
//	void isEvenOdd(int num) {
//		if(num%2==0) {
//			System.out.println(num + " is an even number");
//		}
//		else {
//			System.out.println(num + " is an odd number");
//		}
//	}
//}
//
//class Test{
//	
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.isEvenOdd(0);
//	}
//}


//class Demone{
//	 int addNum(int num , int sel) {
//			return num+sel;
//		 }
//}
//	
// class Testone{
//	 public static void main(String[] args) {
//		Demone de = new Demone();
//		System.out.println(de.addNum(1, 2));
//	}
// }
	
//class Demo{
//	String primeNumber(int num) {
//
//		boolean check = true;
//		for(int i=2; i<num; i++) {
//			if(num%i==0)
//			{
//				check = false;
//			}
//			
//		}
//		if(check==true)
//		{
//			return " is prime number";
//		}
//		else
//		{
//			return "is not prime number";
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args) {
//		Demo d  = new Demo();
//		System.out.println(d.primeNumber(6));
//	}
//}


//class Demo{
//	String primeNumber(int num) {
//
//		int check = 0;
//		for(int i=2; i<num; i++) {
//			if(num%i==0)
//			{
//				check++;
//			}
//			
//		}
//		if(check==0)
//		{
//			return " is prime number";
//		}
//		else
//		{
//			return "is not prime number";
//		}
//	}
//}
//
//class Test{
//	public static void main(String[] args) {
//		Demo d  = new Demo();
//		System.out.println(d.primeNumber(13));
//	}
//}

//class ABC{
//	void add() {
//		int x = 1;
////		System.out.println(x);
//	}
//}
//
//class XYZ{
//	public static void main(String[] args) {
//		ABC a = new ABC();
//		a.add();
//	}
//}

//class ABC{
//	int x = 7;
//}
//
//class XYZ{
//	public static void main(String[] args) {
//		ABC a = new ABC();
//		int b = a.x;
//		System.out.println(b);
//	}
//}

//class Demo{
//	void add(int x, int y) {
//		int z = x+y;
//		System.out.println(z);
//	}
//}
//
//class Test{
//	public static void main(String[] args) {
//		Demo d =new Demo();
//		d.add(1, 8);
//	}
//}


//class Demo{
//	int add(int x, int y) {
//		return x+y;
//	}
//}
//
//class Test{
//	public static void main(String[] args) {
//		Demo d =new Demo();
//		System.out.println(d.add(1, 8));
//	}
//}

//class Demo{
//	
//	static int x = 7;
//	
//	static void show() {
//		System.out.println(x);
//	}
//}
//
//class Test{
//	
//	public static void main(String[] args) {
//		Demo.show();
//	}
//}

//class Demo{
//	public static void main(String[] args) {
//		
//		int x = 17;
//		int y = 10;
//		System.out.println(Math.max(x, y));
//	}
//}

//class Demo{
//	static void arm(int x , int y, int z) {
//		
//		double a  = Math.pow(x,3);
//		double b =  Math.pow(y,3);
//		double c  = Math.pow(z,3);
//		
//		double d = a+b+c;
//		System.out.println(d);
//		
//	}
//}
//
//class Test{
//	public static void main(String[] args) {
//		Demo.arm(1, 5, 3);
//		
//	}
//}

