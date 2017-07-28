package teste;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Conta;
import modelo.Movimentacao;
import modelo.TipoMovimentacao;
import util.JPAUtil;





public class TesteFuncoesJPQL {

	public static void main(String[] args) {


		/** Usando MySQL **/
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		
		
		Conta auxConta = new Conta();
		auxConta.setId(2);
		
		//Definindo a query em JPQL que vai ser executada
		//Le se: Faca a soma da coluna "valor" da tabela "Movimentacao" das linhas que tem o campo "conta_id" = "2" e o campo "tipo" = "SAIDA"
		String comandoEmJPQL = "select sum(linha.valor) from Movimentacao linha     where linha.conta = :parametro1     and  linha.tipo = :parametro2";
		
		
		
		//Preparando um objet do tipo "Query" que de fato pode executar o comando
		Query query = em.createQuery(comandoEmJPQL);
		
		//Definindo o valor do parametro
		query.setParameter("parametro1", auxConta );
		query.setParameter("parametro2", TipoMovimentacao.SAIDA );
		
		
		
		
		//Executando o comando e pegando  resultado
		 BigDecimal soma = (BigDecimal)query.getSingleResult();
		
		
		
		System.out.println("\n*****Resultado da Query******");
		System.out.println("Soma da coluna 'valor' da tabela movimentacao: " +soma);
		
		
		
		
		em.getTransaction().commit();
		em.close();
		
		
		
		
	}//main

	
	
}
