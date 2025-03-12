package controller;

import java.util.Random;
import model.Corrida;

public class ThreadController extends Thread{
	
	private int pulo;
	private int distPercorrida;
	private int idSapo;
	private Corrida corrida;
	
	public ThreadController(Corrida corrida) {
		super();
		this.corrida = corrida;
		this.idSapo = (int) threadId();
	}
	
	@Override
	public void run() {
		Random r = new Random();
		
		do{
			System.out.println("Sapo " + idSapo + "\nDistância do pulo: " + pulo + "\nDistância percorrida: " + distPercorrida + "\n");
			
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			pulo = r.nextInt(0, 10);
			distPercorrida = distPercorrida + pulo;
			
		}while(distPercorrida < corrida.getPercurso());
		
		corrida.setPosicao(corrida.getPosicao() + 1);
		System.out.println("O Sapo " + idSapo + " chegou em " + corrida.getPosicao() + "º!!\n");
	}
}
