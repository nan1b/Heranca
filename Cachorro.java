package Heranca;

public class Cachorro extends Animal{
	public void correr() {
		System.out.println("Cachorro correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au!");
	}
}
