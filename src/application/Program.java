package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		//opção 1 - classe implementando predicate 
		//list.removeIf(new ProductPredicate());
		
		//opção 2 - metódo estático na classe
		//list.removeIf(Product::staticProductPredicate);
		
		//opcao 3 - método não estático
		//list.removeIf(Product::nonStaticProductPredicate);
		
		// opção 4 - Expressão lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		list.removeIf(pred);
		
		//opção 5 -  Expressão lambda inline 
		list.removeIf(p -> p.getPrice()>=100);
				
		
		
		for (Product p: list) {
			System.out.println(p);
		}
	}

}
