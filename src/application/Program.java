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
		
		
		//op��o 1 - classe implementando predicate 
		//list.removeIf(new ProductPredicate());
		
		//op��o 2 - met�do est�tico na classe
		//list.removeIf(Product::staticProductPredicate);
		
		//opcao 3 - m�todo n�o est�tico
		//list.removeIf(Product::nonStaticProductPredicate);
		
		// op��o 4 - Express�o lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		list.removeIf(pred);
		
		//op��o 5 -  Express�o lambda inline 
		list.removeIf(p -> p.getPrice()>=100);
				
		
		
		for (Product p: list) {
			System.out.println(p);
		}
	}

}
