package controle;

public class Thread_ID  extends Thread {
	
	int id = 0;
	
	public Thread_ID (int id) {
		
		this.id = id;
		
	}
	
	public void run() {

		idgeter();
	}

	private void idgeter() {
		
		System.out.println("a " + id + "ª " +  "thread a iniciar recebe o id ==> #" + getId());
		
	}
}

