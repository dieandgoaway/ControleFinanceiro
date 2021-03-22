
import java.util.Date;

public class ObjetivosFinanceiros extends OperadorFinanceiro{
	
	private Date dataFinal;
	private SaldoAcumulado contaObjetivo;
	private Boolean objetivoConcluido;
	
	//Construtor da classe
	public ObjetivosFinanceiros(String nome, double valor, String descricao, Date dataFinal,
			SaldoAcumulado contaObjetivo, Boolean objetivoConcluido) {
		super(nome, valor, descricao);
		this.dataFinal = dataFinal;
		this.contaObjetivo = contaObjetivo;
		this.objetivoConcluido = objetivoConcluido;
	}
	
	//metodo ainda não implementado para estimar a conclusao
	//com base no tempo restante até a data final.
	public Date estimativaConclusao() {
		Date hoje = new Date();
		return hoje;
	}
	
	public Date getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}


	public SaldoAcumulado getContaObjetivo() {
		return contaObjetivo;
	}


	public void setContaObjetivo(SaldoAcumulado contaObjetivo) {
		this.contaObjetivo = contaObjetivo;
	}


	public Boolean getObjetivoConcluido() {
		return objetivoConcluido;
	}


	public void setObjetivoConcluido(Boolean objetivoConcluido) {
		this.objetivoConcluido = objetivoConcluido;
	}


	
	
	
	
	

}
