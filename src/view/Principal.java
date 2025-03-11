package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			ThreadController tc = new ThreadController();
			tc.start();
		}
	}

}
