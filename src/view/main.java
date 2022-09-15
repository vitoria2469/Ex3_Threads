package view;

import controller.RedeThreads;

public class main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			Thread ThreadN = new RedeThreads(i);
			ThreadN.start();
		}
	}

}