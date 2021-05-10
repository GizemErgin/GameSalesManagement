package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User T) {
		if(userCheckService.CheckIfRealPerson(T)) {
			System.out.println("Kullanýcý kaydetme baþarýlý: " + T.getFirstName());
		}else
		{
			System.out.println("Hatalý Ýþlem, Geçerli bir kiþi deðil.");
		}
	}

	@Override
	public void delete(User T) {
		System.out.println("Kullanýcý silindi: " + T.getFirstName());
	}

	@Override
	public void update(User T) {
		System.out.println("Kullanýcý güncellendi. Id: " + T.getId() );
	}

}
