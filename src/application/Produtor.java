package application;

import java.util.Random;

public class Produtor implements Runnable {

	private Ponte ponte;
	private Random random = new Random();

	public Produtor(Ponte ponte) {
		this.ponte = ponte;
	}

	@Override
	public  void run() {
		int total = 0;
		for (int x = 0; x < 5; x++) {
			try {
				Thread.sleep(random.nextInt(3000));
				total += x;
				this.ponte.set(x);
				System.out.println("\t"+total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
