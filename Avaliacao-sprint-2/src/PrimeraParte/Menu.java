package PrimeraParte;

import java.sql.SQLException;
import java.util.Scanner;

import avaliacao.dao.ProdutoDAO;
import avaliacao.modelo.Produto;

public class Menu {
	

	public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner (System.in);
			
		String menu;
		try {
		
		
			System.out.println("-----------------------------------");
			System.out.println( "             Menu:                ");
			System.out.println("-----------------------------------");
			System.out.println("1- Cadastrar ofertas");
			System.out.println("2- Actualizar la primera oferta");
			System.out.println("3- Excluir la segunda oferta ");
			System.out.println("4- Cadastrar mas 21 produtos extras");
			System.out.println("5- Mostrar range de registros");
			System.out.println("0-Salir");
			System.out.println("-----------------------------------");
			
			menu=sc.nextLine();
			switch (menu) {
				case "1":
					System.out.println("Cadastrando as treis ofertas");
					primeraOferta();
				break;
			
				case "2":
					System.out.println("Actualizando primera oferta");
					actualizaPrimeraOferta(sc);
				break;
				
				case "3":
					System.out.println("Excluyendo segunda oferta ");
					excluirSegundaOferta();
				break;
				
				case "4":
					System.out.println("Cadastrando mas 21 produtos extras");
					MaisProdutos();
				break;
				
				case "5":
					System.out.println("Mostrando range de protudos:");
					Rangeprod();
				break;
				
				case "0":
					System.out.println("Vuelva pronto!");
					System.exit(0);
				break;
				default:
					break;
			
			}
			while (menu != "0") ;
		}
		
		 catch (Exception e) {
				System.out.println(e.getMessage()); 
				}
		}
				
		
		
		

		private static void primeraOferta() throws SQLException{
			String nome [] = {"Smart tv", "Smart tv samsung","Smart tv lg"};
			String descricao [] = {"45 polegadas", "50 polegadas", "32 polegadas"};
			String descuento [] = {"1000", "1500","1600"};
			String datainicio [] = {"31-03-2020", "02-01-2019", "15-03-2018"};
			String datafin [] = {"04-07-2030", "03-05-2025", "06-08-2023"};
			
			for (int i=0;i<nome.length;i++) {
				Produto prod=new Produto
						(nome[i], descricao[i], descuento[0], datainicio[i], datafin[i]);
				ProdutoDAO.insertar
				(prod.getNome(),prod.getDescricao(),prod.getDescuento(),prod.getDatainicio(),prod.getDatafin());
				System.out.println(prod);
				
			}
		}
				
		private static void actualizaPrimeraOferta(Scanner sc) throws SQLException {
		
	}

	
		private static void excluirSegundaOferta() throws SQLException {		
			ProdutoDAO.excluiroferta(2);
		}
		
		
	

	private static void MaisProdutos() throws SQLException {
		String nome [] = {"Smart tv", "Smart tv samsung","Smart tv lg",
				"Smart tv", "Smart tv samsung","Smart tv lg",
				"Smart tv", "Smart tv samsung","Smart tv lg",
				"Smart tv", "Smart tv samsung","Smart tv lg",
				"Smart tv", "Smart tv samsung","Smart tv lg",
				"Smart tv", "Smart tv samsung","Smart tv lg",
				"Smart tv", "Smart tv samsung","Smart tv lg"};
		
		String descricao[] = {"45 polegadas", "50 polegadas", "32 polegadas",
				"45 polegadas", "50 polegadas", "32 polegadas",
				"45 polegadas", "50 polegadas", "32 polegadas",
				"45 polegadas", "50 polegadas", "32 polegadas",
				"45 polegadas", "50 polegadas", "32 polegadas",
				"45 polegadas", "50 polegadas", "32 polegadas",
				"45 polegadas", "50 polegadas", "32 polegadas"};
		
		String descuento [] = {"1000", "1500","1600",
				"1000", "1500","1600",
				"1000", "1500","1600",
				"1000", "1500","1600",
				"1000", "1500","1600",
				"1000", "1500","1600",
				"1000", "1500","1600"};
		
		String datainicio [] = {"31-03-2020", "02-01-2019", "15-03-2018",
				"31-03-2020", "02-01-2019", "15-03-2018",
				"31-03-2020", "02-01-2019", "15-03-2018",
				"31-03-2020", "02-01-2019", "15-03-2018",
				"31-03-2020", "02-01-2019", "15-03-2018",
				"31-03-2020", "02-01-2019", "15-03-2018",
				"31-03-2020", "02-01-2019", "15-03-2018",};
		
		String datafin [] = {"04-07-2030", "03-05-2025", "06-08-2023",
				"04-07-2030", "03-05-2025", "06-08-2023",
				"04-07-2030", "03-05-2025", "06-08-2023",
				"04-07-2030", "03-05-2025", "06-08-2023",
				"04-07-2030", "03-05-2025", "06-08-2023",
				"04-07-2030", "03-05-2025", "06-08-2023",
				"04-07-2030", "03-05-2025", "06-08-2023"};
		
		
		for (int i=0;i<nome.length;i++) {
			Produto produtos=new Produto(nome[i], descricao[i], descuento[0], datainicio[i], datafin[i]);
			ProdutoDAO.insertar(produtos.getNome(),produtos.getDescricao(),
					produtos.getDescuento(),produtos.getDatainicio(),produtos.getDatafin());
			System.out.println(produtos);}
		}
		private static void Rangeprod() throws SQLException {
			Scanner sc= new Scanner (System.in);	
			System.out.println("A partir del registro: ");
			int inicio = sc.nextInt();
			System.out.println("hasta: ");
			int fin = sc.nextInt();		
			ProdutoDAO.rangoprodutos(inicio,fin);
				
	}
	
	}




		
	
	
		
	


