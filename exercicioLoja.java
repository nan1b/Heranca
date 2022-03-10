package Heranca;

import java.util.*;

public class exercicioLoja {
	public static void main(String[] args) {
		
		Loja p1 = new Loja("Cropped", 400);
		Loja qtdP1 = new Loja ("Cropped", 300);
		Loja p2 = new Loja("Saia", 100);
		Loja p3 = new Loja("Vestido", 250);
		Loja p4 = new Loja("Calças", 90);
		
		ArrayList<Loja> estoque = new ArrayList<>();
		
		estoque.add(p1);
		estoque.add(p2);
		estoque.add(p3);		
		estoque.add(p4);
		System.out.println(estoque);
		
		estoque.remove(p2);
		System.out.println(estoque);
		
		estoque.set(0, qtdP1);
		System.out.println(estoque);

	}
}
