package learnPolymorphism;

public class overLoading {}

//***** OVERLOADING IN SINGLE CLASS*****  (compile-time)
//can be done on the basis of: 1. number of parameters
//                           2. type of parameters


//Method overloading by number of parameters
//class Z{
//	void show() {
//		System.out.println("show is called");
//	}
//	void show(int x) {
//		System.out.println(x + " is called");
//	}
//	void show(int x , int y) {
//		System.out.println(x + " and " + y + " is called");
//	}
//	
//	public static void main(String[] args) {
//		Z z = new Z();
//		z.show();
//		z.show(5);
//		z.show(3, 2);
//	}
//}



//Method overloading by type of parameters


class Z{
	void show() {
		System.out.println("show is called");
	}
	
	void show(int x) {
		System.out.println(x + " is called");
	}
	
	void show(String x) {
		System.out.println(x + " is called");
	}
	
	void show(String x, int y) {
		System.out.println(x + " and " + y + " is called");
	}
	
	void show(int x , int y) {
		System.out.println(x + " and " + y + " is called");
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		z.show();
		z.show(5);
		z.show(3, 2);
		z.show("check");
		z.show("check", 0);
	}
}

