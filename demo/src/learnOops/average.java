package learnOops;

public class average {}

//Write a program to compute the average of three numbers in Java?


class Demo{
	int x = 3;
	int y = 4;
	int z = 7;
	
	int avg() {
//		System.out.println((x+y+z)/3);
		return ((x+y+z)/3);
	}
}

class Test{
	public static void main(String[] args) {
		Demo d  = new Demo();
		System.out.println(d.avg());
	}
}