package conta;

public interface OperacoesFinanceiras {
	
	public double calculaSaldoJurosCompostos(int meses, double taxa);
	
	public double calculaSaldoJurosSimples(int meses, double taxa);

}
