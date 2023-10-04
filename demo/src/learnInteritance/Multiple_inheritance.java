package learnInteritance;

public class Multiple_inheritance {}


//Classes - 1. Normal methods
//          2. Abstract methods: methods which doesn't have body


//	Abstract can be used only in :
//	Single
//	Heiarchical
//	Multiple


//Types Of Constructor:
//	1. Default/Non-perameterized Constructor
//	2. Perameterized Constructor





//class First{
//	
//	void parent() {
//		System.out.println("This is a parent class");
//	}
//}
//
//class Second extends First{
//	
//	void child() {
//		System.out.println("This is a child class");
//	}
//}
//
//class Third{
//	public static void main(String[] args) {
//		First f = new First();
//		Second s = new Second();
//		f.parent();
//		s.child();
//		s.parent();
//	}
//}

class Vehicle{
	
	Vehicle(){}
	
	Vehicle(String x){
		this.x = x;
	}
	Vehicle(String y, int z){
		this.y = y;
		this.z = z;
	}
	Vehicle(int z){
		this.z = z;
	}	
	
	String x;
	 String y;
	int z;
	void Make(String x) {
		
		System.out.println(x);
	}
	void Model(String y) {
		System.out.println(y);
	}
	void Year(int z ) {
		System.out.println(z);
	}
}

class Car extends Vehicle{
	
	Car(){}
	Car(int a){
		this.a=a;
	}
	
	int a;
	void numDoors(int a) {
		System.out.println("Number of Doors: " + a);
	}
}

class Motorcycle extends Vehicle{
	
	Motorcycle(){}
	
	Motorcycle(String b){
		this.b=b;
	}
	String b;
	void isTwoSeater(String b) {
		System.out.println(b);
	}
}

class Check{
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car c = new Car();
		Motorcycle m = new Motorcycle();
		v.Make("Toyotta");
		v.Model("Camry");
		v.Year(2002);
		c.numDoors(4);
		m.isTwoSeater("NO");
		
	}
}


