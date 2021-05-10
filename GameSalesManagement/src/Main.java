import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.UserManager;
import Entities.User;

public class Main {

	public static void main(String[] args) {

		
		User user1 = new User(1, "Gizem", "Ergin", LocalDate.of(1993, 8, 9), "111111111111", "gizem@gizem.com", "12345");
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
	}

}
