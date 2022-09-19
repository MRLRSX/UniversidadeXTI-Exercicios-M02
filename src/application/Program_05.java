package application;

public class Program_05 {
	
	public static void main(String[] args) {
       
		Ponte ponte = new PonteNaoSincronizada();

		new Thread(new Consumidor(ponte)).start();
        new Thread(new Produtor(ponte)).start();
	}
}
