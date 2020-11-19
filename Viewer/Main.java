package Viewer;

import java.util.Scanner;
import user.UserDTO;
import user.UserController;
/**
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 로그인 
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * **********
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색
 * 9. 이름검색
 * 10. 전체 회원수
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserController userController = new UserController();
		while(true) {
			System.out.println("0. Exit 1. 회원가입 2. 로그인 3. 비밀번호 수정 4. 회원탈퇴 5. 아이디 중복체크"
					+ "6. 마이페이지 7. 회원목록 8. 아이디검색 9. 이름검색 10. 전체 회원수");
			switch (scanner.next()) {
			case "0":
				System.out.println("시스템 종료");
				return;
			case "1" : 
				System.out.println("1. 회원가입");
				userController.postLogin(user)
				break;
			case "2" : 
				System.out.println("2. 로그인");
				break;
			case "3" : 
				System.out.println("3. 비밀번호 수정");
				break;
			case "4" : 
				System.out.println("4. 회원탈퇴");
				break;
			case "5" : 
				System.out.println("5. 아이디 중복체크");
				break;
			case "6" : 
				System.out.println("6. 마이페이지");
				break;
			case "7" : 
				System.out.println("7. 회원목록");
				break;
			case "8" : 
				System.out.println("8. 아이디검색");
				break;
			case "9" : 
				System.out.println("9. 이름검색");
				break;
			case "10" : 
				System.out.println("10. 전체 회원수");
				break;
			}
		}
	}
}
