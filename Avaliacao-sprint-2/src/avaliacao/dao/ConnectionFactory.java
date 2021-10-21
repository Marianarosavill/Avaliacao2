package avaliacao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
public Connection recuperarConexao() throws SQLException {		
		
		return DriverManager.getConnection("jdbc:mysql://localhost/avaliacao?useTimezone=true&serverTimezone=UTC",
						"root","mari1234");	

}
}
