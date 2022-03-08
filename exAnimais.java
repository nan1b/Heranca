package Heranca;

public class exAnimais {
	public static void main (String[] args) {
		Cachorro au1 = new Cachorro();
		Cavalo c1 = new Cavalo();
		Preguica p1 = new Preguica();
		
		au1.setNome("Nina");
		au1.setIdade(5);
		au1.emitirSom();
		
		c1.setNome("Pocotó");
		c1.setIdade(9);
		c1.emitirSom();
		
		p1.setNome("Joselda");
		p1.setIdade(15);
		p1.emitirSom();
	}
}
