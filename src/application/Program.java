package application;

import java.util.ArrayList;
import java.util.List;

import entitites.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//opção 1 
		//list.removeIf(p -> p.getPrice()>=100);
		
		//opção 2 - classe implementando predicate 
		//list.removeIf(new ProductPredicate());
		
		//opção 3 - metódo estático na classe
		//list.removeIf(Product::staticProductPredicate);
		
		//opcao 4 - método não estático
		list.removeIf(Product::nonStaticProductPredicate);
		
		for (Product p: list) {
			System.out.println(p);
		}
	}

}
