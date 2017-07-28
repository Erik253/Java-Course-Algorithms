package teste;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.EntityManager;
import modelo.Conta;
import modelo.Movimentacao;
import modelo.TipoMovimentacao;
import util.JPAUtil;


public class TesteJPARelacionamento {

	
	
	public static void main(String[] args) {


		
		Conta conta = new Conta();
		conta.setTitular("Teste Sakura");
		conta.setBanco("Banco Nihon");
		conta.setAgencia("000");
		conta.setNumero("654321");
		
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData( Calendar.getInstance() );//Inserindo a data de hoje
		movimentacao.setDescricao("Papelaria");
		movimentacao.setTipo( TipoMovimentacao.SAIDA ); //Atribuindo o valor "SAIDA"
		movimentacao.setValor( new BigDecimal(200.0) );
		movimentacao.setConta(conta);
		
		
		/** Usando MySQL **/
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		//Realizando a persistencia. Insert
		//Isso torna estado do objeto "conta" em "Managed"
		em.persist(conta);
		
		
		//Realizando a persistencia. Insert
		//Isso torna estado do objeto "movimentacao" em "Managed"
		em.persist(movimentacao);
		
		
		
		em.getTransaction().commit();
		em.close();
		
	}//main

	
	
	
}//class
