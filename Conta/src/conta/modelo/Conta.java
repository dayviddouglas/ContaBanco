package conta.modelo;

public class Conta {
  
	private int codigo;
	private String nome;
	private double saldo;

	
	
	public int getNumero() {
		
		return codigo;
		
	}
	
	public void setNumero(int numero) {
		this.codigo= numero;
	}
	
	public String getNome() {
		return nome;
		}
	
	public void setNome(String nome) {
		this.nome= nome;
		}
	
	public double getSaldo() {
		return saldo;
		}
	public void setSaldo(double saldo) {
		this.saldo= saldo;
		}
	 
	public Conta () {
		
	}
	
	
	
	public Conta(int numero, String nome, double saldo) {
		this.codigo= numero;
		this.nome= nome;
		this.saldo= saldo;
	}
	
	
}
