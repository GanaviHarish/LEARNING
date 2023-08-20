package elseif;

import java.util.Scanner;

public class DemoApp {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the score");
		int Score=scan.nextInt();
		Demo grade = new Demo();
		grade.giveGrade(Score);
	}
}
