

public class SaldoAcumulado extends OperadorFinanceiro{
	private OperadorFinanceiro saldoEntrada;
	
	
	

	public SaldoAcumulado(String nome, double valor, String descricao) {
		super(nome, valor, descricao);
	}
	
	public void modificarSaldo(OperadorFinanceiro saldoEntrada) {

		if (saldoEntrada instanceof Despesas) {
			this.valor = (this.valor - saldoEntrada.getValor());
			System.out.println("Despesa " + saldoEntrada.getNome() + " de " 
			+ saldoEntrada.getValor() + " subtraído da conta " + this.nome);
		} else if (saldoEntrada instanceof Receitas) {
			this.valor = (this.valor + saldoEntrada.getValor());
			System.out.println("Receita " + saldoEntrada.getNome() + " de " 
			+ saldoEntrada.getValor() + " adicionada à conta " + this.nome);
		}
	}

	public OperadorFinanceiro getSaldoEntrada() {
		return saldoEntrada;
	}

	public void setSaldoEntrada(OperadorFinanceiro saldoEntrada) {
		this.saldoEntrada = saldoEntrada;
	}
	
	
	
	
}
