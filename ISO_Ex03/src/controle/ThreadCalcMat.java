package controle;

import java.util.Random;

public class ThreadCalcMat extends Thread{

	int [] [] mat;
	int i;

	public ThreadCalcMat (int[] [] mat, int i) {
		
		this.i = i;
		this.mat = preenche(mat);
		
	}
	
	public void run() {
		
		calc();
		
	}

	private int [] [] preenche(int [] [] mat) {
		
		Random rand = new Random();
		for(int j = 0; j  < 5; j++) {
			mat[i][j] = rand.nextInt(50+1);
			}
		return mat;
	}

	private void calc() {
		
		int soma = 0;
		for(int j = 0; j < 5; j++) {
			soma = mat[i][j] + soma;
		}
		System.out.println("soma da linha " + (i + 1) + " da thread de ID #" + getId() + " " + soma);
	}
	
}
