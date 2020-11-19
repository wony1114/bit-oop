package user;

public class UserController {
	
	private UserService userService;
	
	
	public UserController() {
		userService = new UserServiceImpl();
	}
	public void post(UserDTO user) {

	}

	public UserDTO postLogin(UserDTO user) {
		UserDTO returnUser = new UserDTO();
		userService.login(user);
		return returnUser;
	}

	public void putPassword(UserDTO user) {
		
	}

	public void delete(UserDTO user) {
		
	}

	public boolean getExistId(UserDTO user) {
		boolean result = false;
		return result;
	}

	public UserDTO getUser(UserDTO user) {
		UserDTO result = new UserDTO();
		return result;
	}

	public UserDTO[] getUserList(UserDTO user) {
		UserDTO[] result = new UserDTO[10];
		return result;
	}

	public UserDTO getById(UserDTO user) {
		UserDTO result = new UserDTO();
		return result;
	}

	public UserDTO[] getByName(UserDTO user) {
		UserDTO[] result = new UserDTO[10];
		return result;
	}

	public int getCount(UserDTO user) {
		int result = 0;
		return result;
	}
}
