package day01;

import java.util.Scanner;

import day01.Naming;
import day01.Operator;

public class Main {
	public static void main(String[] args) {
		
		
		Naming name =  new Naming();
		name.setName("가나다");
		System.out.println("내 이름은 "+name.getName()+"입니다.");
		
		Operator n1 = new Operator();
		n1.setMyNumber1(10);
		
		Operator n2 = new Operator();
		n2.setMyNumber2(15);
		
		System.out.println("myNumber1 + myNumber2: "+(n1.getMyNumber1() + n2.getMyNumber2()));
		System.out.println("myNumber1 - myNumber2: "+(n1.getMyNumber1() - n2.getMyNumber2()));
		System.out.println("myNumber1 * myNumber2: "+(n1.getMyNumber1() * n2.getMyNumber2()));
		System.out.println("myNumber1 / myNumber2: "+(n1.getMyNumber1() / n2.getMyNumber2()));
		
		
		
	}
}
