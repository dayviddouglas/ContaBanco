package conta.opfinanceiras;

import conta.modelo.Conta;

public class CalculaConta implements OperacoesFinanceiras {
	
	private Conta conta;
	
	
	public CalculaConta(Conta contaUsuario) {
		this.conta = contaUsuario;
	}
	
	
	public double calculaSaldoJurosCompostos(int meses, double taxa) {
		double montante = conta.getSaldo() * Math.pow((1 + taxa), meses);
		return montante;
		
	}
	
	public double calculaSaldoJurosSimples(int meses, double taxa) {
		double montante = conta.getSaldo() * (1 + (taxa * meses));
		return montante;
	}

}
