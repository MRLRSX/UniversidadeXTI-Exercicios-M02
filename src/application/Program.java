package application;


/**
 * @author LUCAS ROCHA DOS SANTOS
 * @SINCE 1.0
 * <p> CURSO UNIVERSIDADE XTI DE 2011 ONDE O INSTRUITOR ENSINA UTILIZAR THREADS </p>
 * 
 * */
public class Program extends Thread implements Runnable{
	
	String palavra;
	Long tempo;
	
	public Program (String palavra, Long tempo){
	  this.palavra = palavra;
	  this.tempo = tempo;
	}
	
	public void run(){
		for(int x =0; x < 5; x++) {
			System.out.println(""+ palavra );
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
        
		new Program("LUCAS ROCHA", 1500L).start();
		new Program("DOS SANTOS", 2000L).start();
		
		System.out.println("Ver Thread");
	}
}
