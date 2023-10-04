package learnOops;

public class middle_char {}


//Write a program to display the middle character of a string in Java?

class Mid {
     void str(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 1) {
            System.out.println("Middle character: " + str.charAt(middle));
        } else {
            System.out.println("Middle characters: " + str.charAt(middle - 1) + str.charAt(middle));
        }
    }
}

class Check{
	public static void main(String[] args) {
        Mid m = new Mid();
        m.str("JayShreeRaam");
    }
}