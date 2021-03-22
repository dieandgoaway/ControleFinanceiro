
import java.util.Date;
import java.util.*;
import java.time.LocalDate;


public class ControleFinanceiro {
	
	public static void main(String[] args) {
		Date hoje = new Date();
		Date vencimento = new Date(2021,04,12);
		Date salario = new Date(2021,04,5);

		Despesas conta = new Despesas("Conta de Luz", 160.24, 
				"Conta de Luz do mes de Março de 2021", hoje, true, 3, vencimento);
		
		Receitas auxilioEmergencial = new Receitas("Auxilio Emergencial", 300,
				"Dinheiro do Biroliro", true, salario);
		
		SaldoAcumulado dinheiroEmEspecie = new SaldoAcumulado("Dinheiro em Espécie",
				202.00, "Dinheiro guardado dentro do colchão");
				
        System.out.println("Saldo atual =  " + dinheiroEmEspecie.getValor()); 
        
        dinheiroEmEspecie.modificarSaldo(conta);
        
        System.out.println("Saldo atual =  " + dinheiroEmEspecie.getValor()); 

        dinheiroEmEspecie.modificarSaldo(auxilioEmergencial);

        System.out.println("Saldo atual =  " + dinheiroEmEspecie.getValor()); 

	}

}
