package controller;

public class RedeThreads extends Thread {
	
	private int nThread;
		
	public RedeThreads(int nThread) {
		this.nThread = nThread;
	}
	
	@Override
	public void run() {
		System.out.println(nThread);		
	}
}