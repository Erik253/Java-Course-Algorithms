package teste;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Conta;
import modelo.Movimentacao;
import modelo.TipoMovimentacao;
import util.JPAUtil;


//Fazendo Queries complexas
public class TesteJPQL {

	
	public static void main(String[] args) {


		/** Usando MySQL **/
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		
		
		Conta auxConta = new Conta();
		auxConta.setId(2);
		
		//Definindo a query em JPQL que vai ser executada
		//Le se: Selecione as linhas(objeto do tipo movimentaca que representa uma linha da tabela) da tabela "Movimentacao"
		String comandoEmJPQL = "select linha from Movimentacao linha     where linha.conta = :parametro1     and  linha.tipo = :parametro2     order by linha.valor desc";
		
		
		
		//Preparando um objet do tipo "Query" que de fato pode executar o comando
		Query query = em.createQuery(comandoEmJPQL);
		
		//Definindo o valor do parametro
		query.setParameter("parametro1", auxConta );
		query.setParameter("parametro2", TipoMovimentacao.SAIDA );
		
		
		
		
		//Executando o comando e pegando uma lista como retorno
		List<Movimentacao>resultados = query.getResultList();
		
		
		
		System.out.println("\n*****Resultado da Query******");
		
		//Para cada posicao do ArrayList "resultados", faca...
		for(Movimentacao item: resultados) {
			
			System.out.println("\n*****Conta.id: " +item.getConta().getId() );	
			System.out.println("*****Descricao: "  +item.getDescricao()     );
			System.out.println("*****Tipo: "       +item.getTipo()          );
			System.out.println("*****Valor : "     +item.getValor()         );
			
		}//for
		
		
		
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		
	}//main

}//class
