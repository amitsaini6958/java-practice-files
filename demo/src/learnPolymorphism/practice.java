package learnPolymorphism;

public class practice {}

class Animal{
	void makeSound() {
		System.out.println("Making Sound");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog Making Sound");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat Making Sound");
	}
}

class Bird extends Animal{
	void makeSound() {
		System.out.println("Bird Making Sound");
	}
}