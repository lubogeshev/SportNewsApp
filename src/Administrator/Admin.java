package Administrator;

public class Admin {

	private String adminName;
	private String password;
	
	private Admin(String name, String password) {
		this.adminName = name;
		this.password = password;
	}
	
	public static Admin registerAsAdmin (String name, String password) {
		return new Admin(name, password);
	}
	
	public void loginAsAdmin (String name, String password) {
		if (name.equals(this.adminName) & password.equals(this.password)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login unsuccessful!");
		}
	}
	
	
}
