package conta.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySql implements Conexao {
	
	
	private Connection conexao;
	private static final String USUARIO = "root"; 
	private static final String SENHA = "1234"; 
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/banco_muita_grana";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	
	public void conectar() throws Exception {
		
		Class.forName(DRIVER);
		  conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
	}


	public void desconectar() throws Exception {
		conexao.close();
		
	}

	
	public Connection getConexao() {

		return conexao;
	}
	
	


	




	
	

}
