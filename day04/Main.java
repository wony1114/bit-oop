package day04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO calculator = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		
		System.out.println("계산하기");
		System.out.print("숫자 1: ");
		calculator.setNum1(scanner.nextInt());
		
		System.out.println("연산자 +, -, *, /, %");
		calculator.setOpcode(scanner.next());
		
		System.out.print("숫자 2: ");
		calculator.setNum2(scanner.nextInt());
		
		
		System.out.print("답: "+controller.execute(calculator));
		
		scanner.close();
	}
}
