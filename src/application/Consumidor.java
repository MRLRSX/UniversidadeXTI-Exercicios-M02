package application;

import java.util.Random;

public class Consumidor implements Runnable {
	private Ponte ponte;
	private Random random = new Random();

	public Consumidor(Ponte ponte) {
		this.ponte = ponte;
	}

	@Override
	public void run() {
		int total = 0;
		for (int x = 0; x < 5; x++) {
			try {
				Thread.sleep(random.nextInt(3000));
				total += ponte.get();
				System.err.println("\t" + total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
