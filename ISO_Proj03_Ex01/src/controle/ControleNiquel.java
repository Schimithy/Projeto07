package controle;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ControleNiquel {
	
	static JTextField PainelE;
	static JTextField PainelC;
	static JTextField PainelD;
	static int qtndGiros;
	static JButton Start;
	
	public ControleNiquel(JTextField PainelE, JTextField PainelC, JTextField PainelD, int Giros, JButton start) {
		
		ControleNiquel.Start = start;
		ControleNiquel.PainelE = PainelE;
		ControleNiquel.PainelC = PainelC;
		ControleNiquel.PainelD = PainelD;
		ControleNiquel.qtndGiros = Giros;
		
	}
	
	public static void sorteio(int ID) {
		
		int contSpeed = 0;
		int cont = 0;
		int giros = 0;
		Random rand = new Random();
		int velocidade = 30;
		
		while(cont <= qtndGiros) {
			giros = rand.nextInt(7+1);
			switch (ID) {
			case 1: PainelE.setText(Integer.toString(giros));
				break;
			case 2:  PainelC.setText(Integer.toString(giros));
				break;
			case 3:  PainelD.setText(Integer.toString(giros));
				break;
			}
			try {
				Thread.sleep(velocidade);
			}catch (Exception e){
				System.err.println(e.getMessage());
			}
			if (contSpeed > 15) {
				velocidade = velocidade +15;
				contSpeed = 0;
			}
			contSpeed++;
			cont++;
		}
		Start.setEnabled(true);
	}

}