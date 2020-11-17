package day01;

import java.util.Scanner;

import day01.Naming;


public class Main2 {
	public static void main(String[] args) {
		Naming name =  new Naming();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("이름: ");
		name.setName(scanner.next());
		
		System.out.println("이름은 "+name.getName()+"입니다.");
		
		
		scanner.close();
		
	}
}
