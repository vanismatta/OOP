import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
//Create an Addition.class program that adds the first and second command line arguments supplied 
//to the Java program that is accurate to two decimal places. 
	/*
	 So for example if I were to run:
	
	> java Addition 1 3
	4.00
	
	> java Addition 1.25 3.5
	4.75	
	*/
	
		Double a, b,c;
		System.out.println("Enter two numbers to get sum");
		Scanner in = new Scanner(System.in);
		
		a=in.nextDouble();
		b=in.nextDouble();
		
		c=a+b;
		
		System.out.format("The sum of the two numbers is: " +"%.2f", c);
		
	}

}
