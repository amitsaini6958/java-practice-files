package demo;

public class armstrong {
public static void main(String[] args) {
	
	int n  = 153;
	int temp = n;
	int r,sum = 0;
	
	while(n>0)
	{
 		r = n%10;  //3 5 1 
		n = n/10;  //15
		sum = sum + r*r*r;
	}
	if(temp==sum) {
		System.out.println("It is an armstrong number");
	}
	else {
		System.out.println("It is not an armstrong number");
	}
}
}
