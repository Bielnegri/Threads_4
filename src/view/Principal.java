package view;

import java.util.Random;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int[][] mat = new int[3][5];
		Random r = new Random();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				mat[i][j] = r.nextInt(0, 11);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			ThreadController tc = new ThreadController(mat[i], i);
			tc.start();
		}
	}

}
