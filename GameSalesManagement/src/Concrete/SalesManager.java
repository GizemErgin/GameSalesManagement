package Concrete;

import Abstract.SalesService;
import Entities.Sales;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales T) {
		System.out.println("%" + T.getCampaignRate() + " kampanya oran� ile �r�n " + T.getPrice() + "TL'ye sat�ld�. ");
		System.out.println("Alan Kullan�c� Id: " + T.getUserId());
	}

	@Override
	public void delete(Sales T) {
		System.out.println("Sat�� silindi. Id: " + T.getId());
	}

	@Override
	public void update(Sales T) {
		System.out.println("Sat�� g�ncellendi. Id: " + T.getId());
	}

}
