package day02;

import day02.GradeBook;

public class Main {
	public static void main(String[] args) {
		BMI bmi = new BMI();
		bmi.setHeight(170);
		bmi.setWeight(65.5);
		System.out.printf("BMI 수치는 "+(bmi.getWeight() / bmi.getHeight() / bmi.getHeight())+"입니다.");
		
		
		
		
		
		
		GradeBook gb = new GradeBook();
		gb.setId(1);
		gb.setName("가나다");
		gb.setKorean(100);
		gb.setEnglish(100);
		gb.setMath(100);
		
		System.out.println(gb.getId()+"번 "+gb.getName()+"학생은 국어"+ gb.getKorean()+"점, 영어 "+gb.getEnglish()+"점, 수학 "+gb.getMath()+"점이다.");
	}
}
