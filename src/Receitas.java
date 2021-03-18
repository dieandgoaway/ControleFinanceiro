
import java.util.Date;

public class Receitas {
	
	private double valorReceita;
	private Boolean receitaSalario;
	private Date dataSalario;
	
	public Receitas(double v, Boolean r, Date d) {
		valorReceita = v;
		receitaSalario = r;
		dataSalario = d;
	}

	public double getValorReceita() {
		return valorReceita;
	}

	public void setValorReceita(double valorReceita) {
		this.valorReceita = valorReceita;
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
