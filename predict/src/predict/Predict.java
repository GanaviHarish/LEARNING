package predict;

import java.util.Scanner;

public class Predict {

	public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("enter marks");
     int marks=scan.nextInt();
     grade(marks);
     
	}
    public static void grade(int marks) {
	if(marks>=50)
	System.out.println("pass");
	else
	System.out.println("fail");
    }
}
		
