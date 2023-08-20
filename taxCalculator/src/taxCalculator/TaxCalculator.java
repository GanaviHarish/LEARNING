package taxCalculator;

import java.util.Scanner;

public class TaxCalculator {
     public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		Double purchaseAmount =scan.nextDouble();
		System.out.println("enter the tax rate");
		Double TaxRate= scan.nextDouble();
	    double res =calculateTotalWithTax(purchaseAmount,TaxRate);
	    System.out.println(res);
	}

    public static double calculateTotalWithTax(Double PA, Double TR) {
	System.out.println("the total cost is");
	return PA*TR+PA;
}
}