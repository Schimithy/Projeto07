package controle;

public class CacaNiquel extends Thread{
	
	int ID;
	
	public CacaNiquel( int ID) {
		
		this.ID = ID;
		
	}
	
	public void run() {
		
		roleta();
	}

	private void roleta() {
		
		ControleNiquel.sorteio(ID);
		
	}
	
}
