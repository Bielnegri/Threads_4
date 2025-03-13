package view;

import controller.ThreadController;
import java.util.concurrent.Semaphore;

public class Principal {

	public static void main(String[] args) {
		Semaphore mutex = new Semaphore(1);
		
		for(int i = 0; i < 5; i++) {
			ThreadController tc = new ThreadController(100, mutex);
			tc.start();
		}
	}

}
