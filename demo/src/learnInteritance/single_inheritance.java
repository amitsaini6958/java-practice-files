package learnInteritance;

public class single_inheritance {}


class ABC // parent class/super class/ base class
{
	void run() {
		System.out.println("running");
	}
}

class XYZ extends ABC //child class/sub class/ derived class
{
	void display()
	{
		System.out.println("displaying");
	}
}

class Onetwo{
	public static void main(String[] args) {
		XYZ x = new XYZ();
		x.display();
		x.run();
	}
}