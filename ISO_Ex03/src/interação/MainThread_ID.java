package interação;

import controle.Thread_ID;

public class MainThread_ID {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 5; i++) {
			Thread_ID thread = new Thread_ID (i);
			thread.start();
		}
	}

}
