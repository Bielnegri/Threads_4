package view;

import controller.ThreadController;
import model.Corrida;

public class Principal {

	public static void main(String[] args) {
		Corrida corrida = new Corrida(100);
		
		for(int i = 0; i < 5; i++) {
			ThreadController tc = new ThreadController(corrida);
			tc.start();
		}
	}

}
