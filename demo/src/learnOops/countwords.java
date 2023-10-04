	package learnOops;

public class countwords {}

//Question: how to remove spaces while counting?
class One{
	void  cntwrds(String str) {
		int wordCount = str.length();
		System.out.println(wordCount);
		
	}
}

class Two{
	
	public static void main(String[] args) {
		One o = new One();
		o.cntwrds("Hello!");
	}
}