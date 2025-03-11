package view;

import java.util.Random;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int[] vet = new int[1000];
		Random r = new Random();
		
		for(int i = 0; i < 1000; i++) {
			vet[i] = r.nextInt(1, 101);
		}
		
		for(int i = 1; i < 3; i++) {
			ThreadController tc = new ThreadController(vet, i);
			tc.start();
		}
	}

}
