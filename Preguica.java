package Heranca;

public class Preguica extends Animal{
	public void subirEmArvore() {
		System.out.println("Pregui�a subindo em �rvore");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AAAAAAAA!");
	}
}
