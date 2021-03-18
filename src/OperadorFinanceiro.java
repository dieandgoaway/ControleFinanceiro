

public abstract class OperadorFinanceiro {
	
	private String nome;
	private double valor;
	private String descricao;
	
	
	


	public OperadorFinanceiro(String nome, double valor, String descricao) {
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
