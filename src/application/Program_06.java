package application;

public class Program_06 {
	
	 public static void main(String[] args) {
			Ponte ponte = new PonteSincronizada();

			new Thread(new Consumidor(ponte)).start();
	        new Thread(new Produtor(ponte)).start();
	}
}
