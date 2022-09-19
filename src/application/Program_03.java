package application;

public class Program_03 implements Runnable {
	
	
	Conta conta01 = new Conta(1000.00);
	
	public static void main(String[] args) {
		
           
           Runnable irAsCompra = new Program_03();
           new Thread(irAsCompra, "PAI").start();
           new Thread(irAsCompra, "MAE").start();
           new Thread(irAsCompra, "FILHA").start();
           new Thread(irAsCompra, "BABA").start();
	}

	@Override
	public synchronized void run()  {
	  String cliente = Thread.currentThread().getName();
	  for(int x = 0; x < 5; x++) {
		  conta01.saque(85.00, cliente);		  
	  }
	  
	  if(conta01.getSaldo() < 0) {
		  System.out.println("SALDO ESTOUROU");
	  }
	}
}
