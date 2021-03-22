
import java.util.Date;

public class ControleFinanceiro {
	
	public static void main(String[] args) {
		Date hoje = new Date();
		Date vencimento = new Date(2021,04,12);
		Date salario = new Date(2021,04,5);

		Despesas conta = new Despesas("Conta de Luz", 160.24, 
				"Conta de Luz do mes de Março de 2021", hoje, true, 3, vencimento);
		
		Receitas auxilioEmergencial = new Receitas("Auxilio Emergencial", 300,
				"Dinheiro do Biroliro", true, salario);
		
		Receitas trabalhoFormal = new Receitas("Salário Mensal", 4000,
				" ", true, salario);
		
		SaldoAcumulado dinheiroEmEspecie = new SaldoAcumulado("Dinheiro em Espécie",
				202.00, "Dinheiro guardado dentro do colchão");
		
		
		//imprime o saldo
        System.out.println("Saldo inicial =  " + dinheiroEmEspecie.getValor()); 
        //aplica uma despesa como argumento no metodo modificarSaldo
        dinheiroEmEspecie.modificarSaldo(conta);
        //imprime
        System.out.println("Saldo atual =  " + dinheiroEmEspecie.getValor()); 
        //aplica uma receita como argumento
        dinheiroEmEspecie.modificarSaldo(auxilioEmergencial);
        //imprime
        System.out.println("Saldo atual =  " + dinheiroEmEspecie.getValor()); 
        
        Despesas conta2 = new Despesas("Conta de agua", 163.24, 
				"Conta de agua do mes de Março de 2021", hoje, false, 0, hoje);
        Despesas conta3 = new Despesas("Conta de telefone", 165.24, 
				"Conta de telefone do mes de Março de 2021", hoje, false, 0, hoje);
        Despesas conta4 = new Despesas("Conta de internet", 125.24, 
				"Conta de internet do mes de Março de 2021", hoje, true, 3, hoje);
        
        
        //cria um tipo para classificar contas
        TipoDespesa contasBoletos = new TipoDespesa("Contas da casa", conta2);
        //adiciona novas contas a um tipo pré existente
        contasBoletos.adicionarDespesa(conta3);
        contasBoletos.adicionarDespesa(conta4);
        //testa os getters e contador da classe TipoDespesa
        System.out.println("Classificador de conta '" + contasBoletos.getNomeTipo() + 
        		"' possui um total de " + contasBoletos.getContadorDespesas() + " despesas cadastradas:");
        
        for (int i = 0; i<contasBoletos.getContadorDespesas(); i++) {
        	System.out.print(contasBoletos.getDespesasTipo(i));
        	//print de virgula e espaco caso não seja o ultimo valor da lista de despesas
        	if (i !=  contasBoletos.getContadorDespesas() - 1){
        		System.out.print(", ");
        	}else System.out.print(". \n");
        }
        
        //Teste da classe ObjetivosFinanceiros instanciando o novo objetivo de um Corsa 2006
        Date corsaData = new Date(2026,2,1);
        ObjetivosFinanceiros corsinha2006 = new ObjetivosFinanceiros("Corsa 2006", 16500.00, 
        		"Dinheiro para comprar meu corsinha amarelo", corsaData, dinheiroEmEspecie, false);
        do {
        	//adicionar o saldo até completar o objetivo
            dinheiroEmEspecie.modificarSaldo(trabalhoFormal);
        }while(dinheiroEmEspecie.getValor()<corsinha2006.getValor());
        //setter do objetivo 
        if (dinheiroEmEspecie.getValor()>corsinha2006.getValor()) {
        	corsinha2006.setObjetivoConcluido(true);
        	System.out.println("Objetivo "+ corsinha2006.getNome() + " concluído!");
        }
        
	}

}
