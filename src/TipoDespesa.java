
public class TipoDespesa {
	
	private String nomeTipo;
	private int contadorDespesas = 0;
	private Despesas[] despesasTipo = new Despesas[100];
	
	// Método Construtor da Classe.
	public TipoDespesa(String nomeTipo, Despesas despesasTipo) {
		this.nomeTipo = nomeTipo;
		this.despesasTipo[0] = despesasTipo;
		this.contadorDespesas++;
	}
	
	
	public void adicionarDespesa(Despesas despesasTipo) {
		this.despesasTipo[contadorDespesas] = despesasTipo;
		this.contadorDespesas++;
	}
	
	public String getNomeTipo() {
		return nomeTipo;
	}
	public int getContadorDespesas() {
		return contadorDespesas;
	}


	public void setContadorDespesas(int contadorDespesas) {
		this.contadorDespesas = contadorDespesas;
	}


	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	//Metodo getter modificado para ter como saida o nome da despesa de interesse
	public String getDespesasTipo(int i) {
		return despesasTipo[i].getNome();
	}
	public void setDespesasTipo(Despesas[] despesasTipo) {
		this.despesasTipo = despesasTipo;
	}


}
