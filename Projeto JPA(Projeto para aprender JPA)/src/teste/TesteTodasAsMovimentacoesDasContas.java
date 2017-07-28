package teste;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Conta;
import util.JPAUtil;

public class TesteTodasAsMovimentacoesDasContas {

	public static void main(String[] args) {

		
		/** Usando MySQL **/
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		
		
		//Definindo a query em JPQL que vai ser executada
		

		/*	*/
		String comandoEmJPQL = "select distinct linhas from Conta     linhas       left join fetch     linhas.movimentacoes";


		//Preparando um objeto do tipo "Query" que de fato pode executar o comando
		Query query = em.createQuery(comandoEmJPQL);
		

		//Executando o comando e pegando uma lista como retorno
		List<Conta>todasAsContas = query.getResultList();
		
		
		
		
		System.out.println("\n*****Resultado da Query******");
		
		//Para cada posicao do ArrayList "todasAsContas", faca...
		for(Conta item: todasAsContas) {
			
			System.out.println("\n*****Titular da conta: " +item.getTitular() );	
			System.out.println("*****Quantidade de movimentacoes da conta: " +item.getMovimentacoes().size()  );


		}//for
		
		
		em.getTransaction().commit();
		em.close();
		
		
		
		

	}//main

}//clas
