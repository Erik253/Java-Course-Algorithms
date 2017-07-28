package teste;
import javax.persistence.EntityManager;
import modelo.Conta;
import util.JPAUtil;


public class TestaConta {
	
	
	public static void main(String[] args) {
		
		
		Conta conta = new Conta();
		conta.setTitular("Teste Erik");
		conta.setBanco("Banco X");
		conta.setAgencia("123");
		conta.setNumero("123456");
		
		
		
		/** Usando MySQL **/
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		
		
		//Realizando a persistencia. Insert
		//Isso torna estado do objeto "conta" em "Managed"
		em.persist(conta);
		
		
		
		em.getTransaction().commit();
		em.close();
		
	}//main

}//class
