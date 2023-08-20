package logicalOperatoValidator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println("developing a user registration system");
		Scanner scan = new Scanner(System.in);
		System.out.println("is input vaild(True/False)");
		Boolean A = scan.nextBoolean();
		System.out.println("the input meets a certain condition");
		Boolean B = scan.nextBoolean();
	
	   boolean result=isValidInput(A,B);
		
		if (result) {
			System.out.println("input is valid");
		}else
		{
			System.out.println("input is Invalid");
		}
	}
	
	public static boolean isValidInput(boolean A , boolean B) {
		boolean  result=A&&B;
		return result;
	}

}
