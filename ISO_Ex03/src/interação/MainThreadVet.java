package interação;

import controle.ThreadVetor;

public class MainThreadVet {

	public static void main(String[] args) {
		
		int[] vet = new int[1000];
		
		for (int op = 1; op <= 2; op++) {
			Thread threadvet = new ThreadVetor(op,vet);
			threadvet.start();
		}
	}

}
