package Administrator;

import java.util.HashSet;
import java.util.Set;

public class AdminManager {
	private static Set<Admin> admins = new HashSet<Admin>();


	public static Set<Admin> getAdmins() {
		return admins;
	}

}
