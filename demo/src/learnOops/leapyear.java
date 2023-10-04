package learnOops;

public class leapyear {}


class Demmo{
	void leapYear(int year) {
		  if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	}
}

class Tesst{
	
	public static void main(String[] args) {
		Demmo d = new Demmo();
		d.leapYear(2024);
	}
	
	
}