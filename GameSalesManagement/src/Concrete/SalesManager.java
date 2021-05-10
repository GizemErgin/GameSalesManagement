package Concrete;

import Abstract.SalesService;
import Entities.Sales;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales T) {
		System.out.println("%" + T.getCampaignRate() + " kampanya oraný ile ürün " + T.getPrice() + "TL'ye satýldý. ");
		System.out.println("Alan Kullanýcý Id: " + T.getUserId());
	}

	@Override
	public void delete(Sales T) {
		System.out.println("Satýþ silindi. Id: " + T.getId());
	}

	@Override
	public void update(Sales T) {
		System.out.println("Satýþ güncellendi. Id: " + T.getId());
	}

}
