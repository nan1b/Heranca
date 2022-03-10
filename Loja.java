package Heranca;

public class Loja {
	private String produto;
	private int quantidade;
	
	
	public Loja(String x, int n)
	{
		this.produto=x;
		this.quantidade=n;
	}


	public String getTitulo() {
		return produto;
	}


	public void setTitulo(String titulo) {
		this.produto = titulo;
	}


	public int getTempo() {
		return quantidade;
	}


	public void setTempo(int tempo) {
		this.quantidade = tempo;
	}
	
	public String toString()
	{
		return "Produto:"+this.produto+", "+ "quantidade: " + this.quantidade;
	}
}
