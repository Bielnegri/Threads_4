package controller;

public class ThreadController extends Thread{
	
	public ThreadController() {
		super();
	}
	
	@Override
	public void run() {
		int tid = (int) threadId();
		System.out.println("TID: " + tid);
	}
}
