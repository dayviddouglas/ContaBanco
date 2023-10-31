package conta.servico;

import java.sql.Connection;
import java.sql.Statement;

public class ContaPersistencia implements OperacoesConta {

	private ConexaoMySql conexaoMySql;

	
	public ContaPersistencia(ConexaoMySql conexao) {
		
		this.conexaoMySql = conexao;
		
		try {
			conexaoMySql.conectar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public  void salvar(Conta conta) {
		Connection conn = null;
		try {
			conn = conexaoMySql.getConexao();
			Statement stmt= conn.createStatement();
			Conta c = conta;
			String query = "INSERT INTO CONTA (codigo, nome, saldo) VALUES(" + c.getNumero()+ " , '" + c.getNome() + "' , " + c.getSaldo() + ")";
			stmt.executeUpdate(query);
			stmt.close();
			System.out.println(" Conta cadastrada.");
			
		}catch ( Exception e) {
			e.printStackTrace();
			
		}
		
		
	}



	
	

	
	
}
