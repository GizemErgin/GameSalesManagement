package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product T) {
		System.out.println("�r�n eklendi: " + T.getName());
	}

	@Override
	public void delete(Product T) {
		System.out.println("�r�n silindi: " + T.getName());
	}

	@Override
	public void update(Product T) {
		System.out.println("�r�n g�ncellendi: " + T.getName());
	}

}
