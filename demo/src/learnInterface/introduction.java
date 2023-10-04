package learnInterface;

public class introduction {}


//An interface in Java is a blueprint of a class. It has static constants and abstract methods.

//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods
//in the Java interface, not method body. It is used to achieve abstraction and multiple 
//inheritance in Java.

interface Car{
	void engine();
	void start();
	void drive();
	void stop();
	String color = "";
	String model = "";
	String brand = "";
	int cc = 0;
	
}

class Honda implements Car{
	
	public void engine() {
		System.out.println("V8 engine");
	}
	public void start() {
		System.out.println("Car is starting");
	}
	public void drive() {
		System.out.println("Car is been driven");
	}
	public void stop() {
		System.out.println("Car has been stopped");
	}
	
	String color = "Black";
	String model = "Civic";
	String brand = "Honda";
	int cc = 3199;
}


class Test{
	public static void main(String[] args) {
		Honda civic = new Honda();
		civic.drive();
		civic.engine();
		civic.start();
		civic.stop();
		System.out.println(civic.color);
		System.out.println(civic.cc);
		System.out.println(civic.brand);
	}
}












