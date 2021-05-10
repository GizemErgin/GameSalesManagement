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
			System.out.println("Kullan�c� kaydetme ba�ar�l�: " + T.getFirstName());
		}else
		{
			System.out.println("Hatal� ��lem, Ge�erli bir ki�i de�il.");
		}
	}

	@Override
	public void delete(User T) {
		System.out.println("Kullan�c� silindi: " + T.getFirstName());
	}

	@Override
	public void update(User T) {
		System.out.println("Kullan�c� g�ncellendi. Id: " + T.getId() );
	}

}
