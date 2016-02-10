package Administrator;

public class Admin {

	private String adminName;
	private String password;

	private Admin(String name, String password) {
		this.adminName = name;
		this.password = password;
	}

	public static void registerAsAdmin(String name, String password1, String password2) {
		if (verifyPassword(password1, password2)) {
			AdminManager.getAdmins().add(new Admin(name, password1));
		}
	}

	public void loginAsAdmin(String name, String password) {
		if (name.equals(this.adminName) && password.equals(this.password)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login unsuccessful!");
		}
	}

	private static boolean verifyPassword(String password1, String password2) {
		if (password1.equals(password2)) {
			return true;

		}
		return false;
	}

}
