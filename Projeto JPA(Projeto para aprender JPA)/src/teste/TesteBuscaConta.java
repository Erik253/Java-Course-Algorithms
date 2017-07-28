package teste;
import javax.persistence.EntityManager;
import modelo.Conta;
import util.JPAUtil;



public class TesteBuscaConta {

	public static void main(String[] args) {
		
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
        EntityManager em = new JPAUtil().getEntityManager();
        
        
      //Realizando conexao com o banco
        em.getTransaction().begin();

        //Criando um objeto para receber o resultado da busca
        Conta conta; 
        
        //Select de uma conta com o campo "id=1". Lembrando que defini o campo "id" como chave primaria no arquivo "persistence.xml"
        conta = em.find(Conta.class, 1);
        
        
        //Realizando um update
        conta.setTitular("Erik ZZ - Update");
        
        
        System.out.println("Titular encontrado: " +conta.getTitular() );
        
		em.getTransaction().commit();
        em.close();

	}//main

}//class
