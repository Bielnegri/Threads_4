package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ThreadController extends Thread{
	
	private int pulo;
	private int distPercorrida;
	private int idSapo;
	private int percurso;
	private Semaphore mutex;
	
	private static int posicao;
	
	public ThreadController(int percurso, Semaphore mutex) {
		super();
		this.percurso = percurso;
		this.idSapo = (int) threadId();
		this.mutex = mutex;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		
		do{	
			pulo = r.nextInt(0, 10);
			distPercorrida = distPercorrida + pulo;
			System.out.println("Sapo " + idSapo + "\nDistância do pulo: " + pulo + "\nDistância percorrida: " + distPercorrida + "\n");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}while(distPercorrida < percurso);
		
		try {
			mutex.acquire();
			posicao++;
			System.out.println("O Sapo " + idSapo + " chegou em " + posicao + "º!!\n");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			mutex.release();
		}
	}
}
