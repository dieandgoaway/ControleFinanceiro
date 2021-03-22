
import java.util.Date;

public class Receitas extends OperadorFinanceiro{
	
	private Boolean receitaSalario;
	private Date dataSalario;
	
	
	public Receitas(String nome, double valor, String descricao,
			Boolean receitaSalario, Date dataSalario) {
		super(nome, valor, descricao);
		this.receitaSalario = receitaSalario;
		this.dataSalario = dataSalario;
	}


	public Boolean getReceitaSalario() {
		return receitaSalario;
	}


	public void setReceitaSalario(Boolean receitaSalario) {
		this.receitaSalario = receitaSalario;
	}


	public Date getDataSalario() {
		return dataSalario;
	}


	public void setDataSalario(Date dataSalario) {
		this.dataSalario = dataSalario;
	}

	

}
