package avaliacao.modelo;

public class Produto {
	private String nome ;
	private String descricao; 
	private String descuento ;
	private String datainicio ;
	private String datafin;
	
	
	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Produto(String nome, String descricao, String desconto, String dataInicio, String dataFin) {
		this.nome = nome;
		this.descricao = descricao;
		this.descuento = desconto;
		this.datainicio = dataInicio;
		this.datafin = dataFin;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}

	public String getDatafin() {
		return datafin;
	}

	public void setDatafin(String datafin) {
		this.datafin = datafin;
	}
	


	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}