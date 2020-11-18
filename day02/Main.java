package day02;

import java.util.Scanner;

import day02.GradeBook;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BMI b = new BMI();
		
		System.out.print("몸무게: ");
		b.setWeight(scanner.nextDouble());
		System.out.print("키: ");
		b.setHeight(scanner.nextDouble());
		
		double bmi = b.getWeight() / b.getHeight() / b.getHeight();
		
		System.out.printf("BMI 수치는 %.2f입니다.\n", bmi);
		
		
		
		System.out.println("======================라인정리========================");
		
		
		GradeBook gb = new GradeBook();
		
		System.out.print("번호: ");
		gb.setId(scanner.nextInt());
		System.out.print("이름: ");
		gb.setName(scanner.next());
		System.out.print("국어: ");
		gb.setKorean(scanner.nextInt());
		System.out.print("영어: ");
		gb.setEnglish(scanner.nextInt());
		System.out.print("수학: ");
		gb.setMath(scanner.nextInt());
		
		int sum = gb.getKorean() + gb.getEnglish() + gb.getMath();
		double average = sum / 3.0;
		
		System.out.println(gb.getId()+"번 "+gb.getName()+"학생은 국어"+ gb.getKorean()+"점, 영어 "+gb.getEnglish()+"점, 수학 "+gb.getMath()+"점이다.");
		System.out.println("총점: "+sum+"점");
		System.out.println("평균: "+average+"점");
	}
}
