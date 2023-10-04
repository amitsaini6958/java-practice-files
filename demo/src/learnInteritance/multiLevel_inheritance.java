package learnInteritance;

public class multiLevel_inheritance {}

//  grandparent
//      |
//    parent
//      |
//    child

class Animal{
	void Eat() {
		System.out.println("eating");
	}
	void Walk() {
		System.out.println("walking");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("voice");
	}
}

class Persian extends Cat{
	void furr() {
		System.out.println("has furr");
	}
}


class Demo2{
	public static void main(String[] args) {
		Persian p = new Persian();
		p.Eat();
		p.furr();
		p.meow();
	}
}