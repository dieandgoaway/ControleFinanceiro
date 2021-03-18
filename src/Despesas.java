
import java.util.Date;

public class Despesas {

	private double valorDespesa;
	private Date dataVencimento;
	private String  descricaoDespesa;
	private Boolean despesaParcelada;
	private int parcelasRestantes;
	private String classificacaoDespesa;
	
	public Despesas(double v, String c, String desc, Boolean desp, int p, Date da) {
		valorDespesa = v;
		classificacaoDespesa = c;
		descricaoDespesa = desc;
		despesaParcelada = desp;
		parcelasRestantes = p;
		dataVencimento = da;
	}

	public double getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(String descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	public Boolean getDespesaParcelada() {
		return despesaParcelada;
	}

	public void setDespesaParcelada(Boolean despesaParcelada) {
		this.despesaParcelada = despesaParcelada;
	}

	public int getParcelasRestantes() {
		return parcelasRestantes;
	}

	public void setParcelasRestantes(int parcelasRestantes) {
		this.parcelasRestantes = parcelasRestantes;
	}

	public String getClassificacaoDespesa() {
		return classificacaoDespesa;
	}

	public void setClassificacaoDespesa(String classificacaoDespesa) {
		this.classificacaoDespesa = classificacaoDespesa;
	}

}
