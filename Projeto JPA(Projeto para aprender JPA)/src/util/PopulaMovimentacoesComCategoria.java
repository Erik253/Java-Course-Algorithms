package util;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import javax.persistence.EntityManager;
import modelo.Categoria;
import modelo.Conta;
import modelo.Movimentacao;
import modelo.TipoMovimentacao;




public class PopulaMovimentacoesComCategoria {
	
	public static void main(String[] args) {

		
		
		
		Conta conta = new Conta();
		conta.setId(2);
		
		
		//Criando objetos do tipo Categoria
		Categoria categoria1 = new Categoria("Viagem");
		Categoria categoria2 = new Categoria("Negocios");
		
		
		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setData( Calendar.getInstance() ); //Data atual
		movimentacao1.setDescricao("Viagem para SP");
		movimentacao1.setTipo(TipoMovimentacao.SAIDA); //O valor desse atributo vai ser uma string "SAIDA"
		movimentacao1.setValor( new BigDecimal("100.0") );
		movimentacao1.setCategoria( Arrays.asList(categoria1, categoria2)  ); //Adicionando/relacionando duas categorias
		movimentacao1.setConta(conta);
		
		Calendar amanha = Calendar.getInstance();
		amanha.add(Calendar.DAY_OF_MONTH, 1);
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setData( amanha); //Data de amanha
		movimentacao2.setDescricao("Viagem para RJ");
		movimentacao2.setTipo(TipoMovimentacao.SAIDA); //O valor desse atributo vai ser uma string "SAIDA"
		movimentacao2.setValor( new BigDecimal("300.0") );
		movimentacao2.setCategoria( Arrays.asList(categoria1, categoria2)  ); //Adicionando/relacionando duas categorias
		movimentacao2.setConta(conta);
		
		
		
		
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		

		
		//Realizando a persistencia. Insert
		em.persist(categoria1);
		em.persist(categoria2);	
		
		em.persist(movimentacao1);
		em.persist(movimentacao2);		
		
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		
	}//main


}//class
