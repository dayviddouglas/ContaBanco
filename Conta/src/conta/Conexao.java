package conta;

import java.sql.Connection;

public interface Conexao{
	
	public void conectar() throws Exception;
	
	public void desconectar() throws Exception;
	
	public Connection getConexao();
		

}
