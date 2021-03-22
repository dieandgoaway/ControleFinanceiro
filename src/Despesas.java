
import java.util.Date;

public class Despesas extends OperadorFinanceiro{
	
	private Date dataCadastro;
	private Date dataVencimento;
	private int parcelasRestantes;
	private Boolean despesaParcelada;
	
	public Despesas(String nome, double valor, String descricao,Date dataCadastro, Boolean despesaParcelada, int parcelasRestantes, Date dataVencimento) {
		super(nome, valor, descricao);
		this.dataCadastro = dataCadastro;
		this.dataVencimento = dataVencimento;
		this.despesaParcelada = despesaParcelada;
		this.parcelasRestantes = parcelasRestantes;
	}
	
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	

	

}
