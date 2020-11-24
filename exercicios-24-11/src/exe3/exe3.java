package exe3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

public class exe3 {
	public static void main(String[] args) throws ParseException {
		
	produto bala = new produto("Bala", 0.25, 800,"24/11/2020");
	produto carrinhho = new produto("Carrinho", 5, 80, "24/11/2020");
	produto pipa = new produto("Pipa", 0.25, 150, "24/11/2020");
	
	Collection<produto> estoque = new ArrayList<>();
	
	estoque.add(bala);
	estoque.add(pipa);
	estoque.add(carrinhho);
	
	for(produto e: estoque) {
		System.out.println(e);
	}
	estoque.remove(pipa);
	System.out.println("\n"+"removendo item do estoque: "+ "\n");
	for(produto e: estoque) {
		System.out.println(e);
		}
	}
}
