package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	@Override
	public void add(User T) {
		System.out.println("Kullanýcý kaydetme baþarýlý: " + T.getFirstName());
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
