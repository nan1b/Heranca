package Heranca;

public class Preguica extends Animal{
	public void subirEmArvore() {
		System.out.println("Preguiça subindo em árvore");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AAAAAAAA!");
	}
}
