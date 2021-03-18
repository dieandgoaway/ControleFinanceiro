
public class TipoDespesa {
	
	private String nomeTipo;
	private int contadorDespesas = 0;
	private Despesas[] despesasTipo = new Despesas[100];
	
	// Método Construtor da Classe.
	public TipoDespesa(String nomeTipo, Despesas despesasTipo) {
		this.nomeTipo = nomeTipo;
		this.despesasTipo[contadorDespesas] = despesasTipo;
		this.contadorDespesas++;
	}
	
	
	public String getNomeTipo() {
		return nomeTipo;
	}
	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	public Despesas[] getDespesasTipo() {
		return despesasTipo;
	}
	public void setDespesasTipo(Despesas[] despesasTipo) {
		this.despesasTipo = despesasTipo;
	}


}
