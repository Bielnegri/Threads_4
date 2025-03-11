package controller;

public class ThreadController extends Thread{
	
	private int[] vet;
	private int linha;
	
	public ThreadController(int[] vet, int linha) {
		super();
		this.vet = vet;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		int soma = 0;
		
		for(int i = 0; i < this.vet.length; i++) {
			soma = soma + vet[i];
		}
		
		System.out.println("Linha " + this.linha + "\nSoma: " + soma);
	}
}
