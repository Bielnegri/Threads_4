package controller;

public class ThreadController extends Thread{
	
	private int[] vet;
	private int n;
	
	public ThreadController(int[] vet, int n) {
		super();
		this.vet = vet;
		this.n = n;
	}
	
	@Override
	public void run() {		
		if(this.n % 2 == 0) {
			double inicio = System.nanoTime();
			
			for(int i = 0; i < this.vet.length; i++) {
				
			}
			
			double fim = System.nanoTime();
			double total = fim - inicio;
			total = total / Math.pow(10, 9);
			System.out.println("Tempo For: " + total);
		}
		else {
			double inicio = System.nanoTime();
			
			for(int n : this.vet) {
				
			}
			
			double fim = System.nanoTime();
			double total = fim - inicio;
			total = total / Math.pow(10, 9);
			System.out.println("Tempo Foreach: " + total);
			
		}
		
	}
}
