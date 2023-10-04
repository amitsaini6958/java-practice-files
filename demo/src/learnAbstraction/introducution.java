package learnAbstraction;

public class introducution {}

//Abstract class has two types of method
//abstract method can only be defined in abstract class
//we can not create object of abstract class but can be called by it's creating children class

//abstract class AB{
//	
//	//1. normal method
//	
//	void display() {
//		System.out.println("AB is displaying");
//	}
//	
////	2. Abstract method -  abstarct method has no body
//	abstract void show();
//}
//
//class XY extends AB{
//	void show() {
//		System.out.println("AB is showing");
//	}
//}
//
//class JK extends AB{
//	
//	@Override  // Annotations
//	void
//}
//
//class Tesst{
//	public static void main(String[] args) {
//		XY x = new XY();
//		x.display();
//		x.show();
//	}
//  
//}

//abstract class Parent{
//	void message() {
//		System.out.println("It displays message");
//	}
//}
//
//
//class First extends Parent{
//	void message() {
//		System.out.println("This is first subclass");
//}}
//	
//class Second extends Parent{
//		void message() {
//			System.out.println("This is second subclass");
//	}
//}
//		
//class Test{
//	public static void main(String[] args) {
//		First f = new First();
//		f.message();
////	ERROR:	not fetching method of parent class
//		Second s = new Second();
//		s.message();
//	}}

//Create an abstract class 'Bank' with an abstract method 'getBalance'. 
//$100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by 
//creating an object of each of the three classes.

abstract class Bank{
	abstract void getBalannce();
}

class BankA extends Bank{
	void getBalance(){
		System.out.println("$100");
	}}

class BankB extends Bank{
	void getBalance() {
		System.out.println("$150");
	}
}















