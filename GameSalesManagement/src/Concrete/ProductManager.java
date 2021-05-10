package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product T) {
		System.out.println("Ürün eklendi: " + T.getName());
	}

	@Override
	public void delete(Product T) {
		System.out.println("Ürün silindi: " + T.getName());
	}

	@Override
	public void update(Product T) {
		System.out.println("Ürün güncellendi: " + T.getName());
	}

}
