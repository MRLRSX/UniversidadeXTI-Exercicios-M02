package application;



/**
 *  TOPICOS COMPLEMENTARES DE JAVA THREAD
 * */
public class Program_02 implements Runnable{
    
	public String texto;
	public Long time;
	
	public Program_02(String texto, Long time) {
		this.time = time;
		this.texto = texto;
	}
	
	public static void main(String[] args) {
           Runnable teste01 = new Program_02("ANNA CLARA", 1500L);
           Runnable teste02 = new Program_02("BERNARDINO DA ROCHA", 2500L);
           
           teste01.run();
           teste02.run();
	}

	@Override
	public void run() {
		for(int x = 0; x < 5; x++) {
			System.out.println("" + this.texto);
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
