package calculatorDilemna;

import java.util.Scanner;

public class Calculator {
      public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arthimatic opration");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println("enter your operation eg: add, sub, multi, div");
		String operation = scan.next();
		DilemmappApp d = new DilemmappApp();
		d.calculator(n,m,operation);
      }
      
	}
     

      
		