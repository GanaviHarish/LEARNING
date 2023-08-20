
import java.util.Scanner;

public class ArthimeticDemo {
           public static void main(String[] args) {
        	   Scanner scan = new Scanner(System.in);
        	   System.out.println("Enter 2 number");
        	   long num1 = scan.nextLong();
        	   long num2 = scan.nextLong();
        	   System.out.println(galacticArithmetic(num1 , num2));
           }
           public static long galacticArithmetic(long num1, long num2) {
        	   return num1 +num2;
           }
}
