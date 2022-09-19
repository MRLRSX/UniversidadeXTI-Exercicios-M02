package application;

public class PonteSincronizada implements Ponte {

	private int valor = -1;
	private boolean ocupado = false;

	@Override
	public synchronized void set(int valor) throws InterruptedException {
		while (ocupado) {
			System.out.println("Ponte está cheia. Produtor Aguarde !");
			wait();
		}
		this.valor = valor;
		System.out.print("Produziu " + valor);
        ocupado = true;
        notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while(!ocupado) {
			System.out.println("Ponte Esta Vazia. Consumidor Está Aguardando");
			wait();
		}
		System.err.print("Consume " + valor);
		ocupado = false;
		notifyAll();
		return valor;
	}

}
