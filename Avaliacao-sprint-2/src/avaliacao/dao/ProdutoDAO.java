package avaliacao.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import avaliacao.modelo.Produto;


public class ProdutoDAO {

	private Connection connection;
	
	public ProdutoDAO (Connection connection) {
		this.connection = connection;
	}

	public static void insertar(String nome, String descricao, String descuento, String datainicio,
			String datafin) throws SQLException {
		
		BigDecimal descuent = new BigDecimal(descuento);		
		LocalDate dataInicio = LocalDate.parse(datainicio);	
		LocalDate dataFin = LocalDate.parse(datafin);
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();
		Statement stm = connection.createStatement();	
		stm.execute("INSERT INTO PRODUTO (nome, descricao, desconto, dataInicio, dataFim) VALUES('"+nome+"', '"+descricao+"','"+descuent+"','"+datainicio+"','"+datafin+"')"
				, Statement.RETURN_GENERATED_KEYS);	
		
				ResultSet rst = stm.getGeneratedKeys();
				
				while(rst.next()) {
					Integer id = rst.getInt(1);						
					System.out.println("\nO id --> " + id + " foi criado e salvo com sucesso!!!");
				}
			}
		

	

	public void actualizar (Produto produto) throws SQLException {



			String sql = "UPDATE PRODUTO SET NOME = ?, DESCRICAO = ?, DESCONTO = ?, DATA_INICIO = ?, DATA_FIM = ? WHERE PRODUTO.ID = ?";
			
			
			try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				pstm.setString(1, produto.getNome());
				pstm.setString(2, produto.getDescricao());
				pstm.setString(3, produto.getDescuento());
				pstm.setString(4, produto.getDatainicio());
				pstm.setString(5, produto.getDatafin());
				pstm.setInt(6, produto.getId());

				pstm.execute();

		}

	}
	
		
		public static void excluiroferta(int id) throws SQLException {
			
			ConnectionFactory criaConexao = new ConnectionFactory();
			Connection connection = criaConexao.recuperarConexao();
					
			Statement stm = connection.createStatement();	
			
			stm.execute("DELETE FROM `avaliacao`.`produto` WHERE (`id` = '"+id+"');");	
			
			System.out.println("exito");
			;
			
		}
		public static void rangoprodutos(int inicio, int fim) throws SQLException {
			ConnectionFactory criaConexao = new ConnectionFactory();
			Connection connection = criaConexao.recuperarConexao();
					
			Statement stm = connection.createStatement();	
			
					PreparedStatement stmm = 
							connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO WHERE id>="+inicio+" and id<"+fim+"");
					stmm.execute();
					
					ResultSet rst = stmm.getResultSet();
					
					while(rst.next()) {
					
						Integer id = rst.getInt("ID");
						System.out.println("ID: "+id);
						String nome = rst.getString("NOME");
						System.out.println("NOME: "+nome);
						String descricaoo = rst.getString("DESCRICAO");
						System.out.println("DESCRICAO: "+descricaoo);
					
					}
	
					
					
	}

	
			
		}

	
	



 
