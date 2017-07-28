package teste;
import javax.persistence.EntityManager;
import modelo.Conta;
import modelo.Movimentacao;
import util.JPAUtil;




public class TesteMovimentacaoConta {

	public static void main(String[] args) {

		
		
		
		/** Usando MySQL **/
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		
		
		
		//Realizando um select na tabela "Movimentacao" para trazer a linha com o campo id = 3
		//Nesse momento o objeto movimentacao fica no estado "managed"(sincronizado com o banco)
		Movimentacao movimentacao = em.find(Movimentacao.class, 3);
		
		
		//Extraindo o objeto do tipo "Conta" no qual o objeto movimentacao esta relacionado
		Conta conta = movimentacao.getConta();
	
		System.out.println("O titular da conta é: " +conta.getTitular() );
		
		
		
		
		//Pegando quantas movimentacoes a conta tem
		System.out.println( "Quantidade de movimentacoes que a conta tem: " +conta.getMovimentacoes().size() );
		
		
		
		
		em.getTransaction().commit();
		em.close();
		
		
		

	}//main

}//class
