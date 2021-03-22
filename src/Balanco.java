
import java.util.Date;

public class Balanco {
	private Date dataInicial;
	private Date dataFinal;
	private TipoDespesa[] despesasPorTipo;
	private Receitas[] receitasPeriodo;
	
	
	public Balanco(Date dataInicial, Date dataFinal, TipoDespesa[] despesasPorTipo, Receitas[] receitasPeriodo) {
		super();
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.despesasPorTipo = despesasPorTipo;
		this.receitasPeriodo = receitasPeriodo;
	}


	public void demonstrarBalanco() {
		
	}


	public Date getDataInicial() {
		return dataInicial;
	}


	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}


	public Date getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}


	public TipoDespesa[] getDespesasPorTipo() {
		return despesasPorTipo;
	}


	public void setDespesasPorTipo(TipoDespesa[] despesasPorTipo) {
		this.despesasPorTipo = despesasPorTipo;
	}


	public Receitas[] getReceitasPeriodo() {
		return receitasPeriodo;
	}


	public void setReceitasPeriodo(Receitas[] receitasPeriodo) {
		this.receitasPeriodo = receitasPeriodo;
	}

}
