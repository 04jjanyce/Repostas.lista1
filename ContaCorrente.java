public class ContaCorrente {
	private int numConta;
	private double saldo;
	
	public ContaCorrente(int ndc, double s) {
		this.numConta = ndc;
		this.saldo = s;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumconta(int ndc) {
		this.numConta = ndc;
	}
	
	public void sacar(double saque) {
		this.saldo -= saque;
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public String toString() {
		return "Número da conta:" + numConta + "\nsaldo R$" + saldo;
	}
}
