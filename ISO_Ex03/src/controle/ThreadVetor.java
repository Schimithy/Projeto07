package controle;

import java.util.Random;

public class ThreadVetor extends Thread {
	
	int op;
	int[] vet = new int[1000];
	
	public ThreadVetor(int op, int[] vet) {
		
		this.op = op;
		this.vet = vet;
		
	}
	
	public void run() {

		percorre();
		
	}
		
	private void percorre() {
		
		Random rand = new Random();
		double tim1 = 0, tim2 = 0;
		if (op == 1) {
			tim1 = System.currentTimeMillis();
			for (int i = 0; i < vet.length; i++) {
				vet[i] = rand.nextInt(100 + 1);
			}
			tim2 = System.currentTimeMillis();
			tim1 = tim2 - tim1;
			tim1 = tim1/Math.pow(10, 3);
			System.out.printf("tempo para percorrer utilizando .length ==> %.3fs\n", tim1);
		}
		else {
			tim1 = System.currentTimeMillis();
			for (int i : vet) {
				vet[i] = rand.nextInt(100 + 1);
			}
			tim2 = System.currentTimeMillis();
			tim1 = tim2 - tim1;
			tim2 = tim1/Math.pow(10, 3);
			System.out.printf("tempo para percorrer utilizando foreach ==> %.3fs\n", tim2);
		}			
	}
}
