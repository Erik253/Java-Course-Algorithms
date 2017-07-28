package teste;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Categoria;
import modelo.Conta;
import modelo.Movimentacao;
import modelo.TipoMovimentacao;
import util.JPAUtil;



public class TestaJPQLMovimentacoesPorCategoria {

	public static void main(String[] args) {


		/** Usando MySQL **/
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		
		
		Categoria auxCategoria = new Categoria();
		auxCategoria.setId(1);
		
		
		
		//Definindo a query em JPQL que vai ser executada
		

		/*
		Objetivo dessa query: Selecionar todas as Movimentacoes que tem a categoria de id "1"
		
		Detalhe: Fica dificil entender a leitura, pois a tabela "movimentacao" nao tem o campo "categoria", e ai tem que envolver a tabela relacional "movimentacao_categoria" na parada. Por isso, eh bom olhar o diagrama das tabelas para entender melhor essa query
        Le se  : Selecione todas as linhas da tabela "Movimentacao"     onde o campo "categoria"      seja igual a "1"
		*/
		String comandoEmJPQL = "select linhas from Movimentacao     linhas           join          linhas.categoria atributoCategoria     where atributoCategoria = :parametro1";


		
		
		
		
		//Preparando um objet do tipo "Query" que de fato pode executar o comando
		Query query = em.createQuery(comandoEmJPQL);
		
		//Definindo o parametro. Que vai ser automaticamente o campo chave do objeto "auxCategoria" que tem o valor "1"
		query.setParameter( "parametro1", auxCategoria  );
		

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
