
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	String titular;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void depositar (double depositaValor) {
		this.setSaldo(this.getSaldo() + depositaValor);
		
	}
	public boolean transferir (double transfereValor) {
		this.setSaldo(this.getSaldo() - transfereValor);
		return true;
		}
	
	}
	
