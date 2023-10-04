package learnInteritance;

public class Heirarchical_inheritance {}

class Animal{
	void eat() {
		System.out.println("eating");
	}
	void walk() {
		System.out.println("walking");
	}
}

class Human extends Animal{
	void read() {
		System.out.println("reading");
	}
	void write() {
		System.out.println("reading");
	}
}

class Student extends Human{
	void study() {
		System.out.println("studying");
	}
	void write() {
		System.out.println("writing");
	}
}


class Cat extends Animal{
	void meow() {
		System.out.println("call");
	}
}

class Persian extends Cat{
	void furr(){
		System.out.println("has furr");
	}
}


class hemlogaayyyz{
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
		s.walk();
		s.read();
		s.study();	
		
		Persian p = new Persian();
		p.eat();
		p.walk();
		p.meow();
		p.furr();
	}
	
	   
	   
	
}