package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	@Override
	public void add(User T) {
		System.out.println("Kullan�c� kaydetme ba�ar�l�: " + T.getFirstName());
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
