package Viewer;

import java.util.Scanner;
import calculator.*;
import bmi.*;
import user.UserDTO;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO calculator = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		BmiController bmicontroller = new BmiController();
		BmiDTO bmi = new BmiDTO();
		UserDTO user = new UserDTO();
		System.out.println("0. Exit 1. 계산기 2. BMI");
		
		switch(scanner.next()) {
		case "1":
		
		System.out.println("계산하기");
		System.out.print("숫자 1: ");
		calculator.setNum1(scanner.nextInt());
		System.out.println("연산자 +, -, *, /, %");
		calculator.setOpcode(scanner.next());
		System.out.print("숫자 2: ");
		calculator.setNum2(scanner.nextInt());
		System.out.print("답: "+controller.execute(calculator));
		break;
		case "2":
		System.out.println("==BMI==");
		System.out.print("이름을 입력하세요.: ");
		user.setName(scanner.next());
		System.out.println("몸무게를 입력하세요: ");
		bmi.setWeight(scanner.nextDouble());		
		System.out.print("키를 입력하세요: ");
		bmi.setHeight(scanner.nextDouble());
		String bmiResult = bmicontroller.getBmi(user, bmi);
		System.out.println(bmicontroller.getBmi(user, bmi));
		break;
		case"0":
			System.out.println("시스템 종료");
		break;
		}
		scanner.close();
		
	}
}
