package user;
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
public interface UserService {
	public String signup(UserDTO user);
	public String login(UserDTO user);
	public String changePassword(UserDTO user);
	public String withdrawal(UserDTO user);
	public String duplicate(UserDTO user);
	public String mypage(UserDTO user);
	public String listofMembers(UserDTO user);
	public String idSearch(UserDTO user);
	public String nameSearch(UserDTO user);
	public String totalMembersip(UserDTO user);
}
