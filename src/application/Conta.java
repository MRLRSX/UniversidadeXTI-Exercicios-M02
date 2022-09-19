package application;

public class Conta {

	private Double saldo;

	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	public void saque(Double valor, String cliente){
		if (saldo >= valor) {
            System.out.printf("Nome: %s  Vai Saquar ! \n", cliente);
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException erro) {
				erro.printStackTrace();
			}
			this.saldo -= valor;
			System.out.printf("Nome: %s -> Saque ->  US$ %.2f Saldo Atual -> US$ %.2f \n", cliente, valor, saldo);
		}else {
			System.out.printf("Nome -> %s  Saldo Atual -> US$ %.2f \n", cliente, saldo);
		}
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
