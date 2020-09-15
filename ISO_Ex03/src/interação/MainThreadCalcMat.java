package interação;

import controle.ThreadCalcMat;

public class MainThreadCalcMat {

	public static void main(String[] args) {
		
		int[][] mat = new int [3][5];
		for (int i = 0; i < 3; i++) {
			ThreadCalcMat calcmat = new ThreadCalcMat(mat, i);
			calcmat.start();
		}
		
	}

}
