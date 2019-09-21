import java.util.Scanner;

//Daniel Kenny
//21/09/2019
//An example of a recursive method that returns the factorial of a number


public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		
		System.out.println("Enter an int:");
		userInput = sc.nextInt();
		
		System.out.println(userInput+"! is " + fact(userInput));
		

	}
	
	//Method assumes non negative input
	public static int fact(int n) {
		if(n >= 1) {
			return n * fact(n -1);
		}
		else {
			return 1;
		}
	}

}
