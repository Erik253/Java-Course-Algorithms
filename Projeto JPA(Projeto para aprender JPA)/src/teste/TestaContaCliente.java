package teste;

import javax.persistence.EntityManager;

import modelo.Cliente;
import modelo.Conta;
import util.JPAUtil;

public class TestaContaCliente {

	public static void main(String[] args) {

		
	
		//Referenciando uma conta ja existente na tabela com o id=2. O que significa que nesse momento a conta esta no estado "detached" para o Hibernate
		Conta conta = new Conta();
		conta.setId(2);

		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Erik");
		cliente.setEndereco("Philadelphia, 23");
		cliente.setProfissao("Super Rich");
		cliente.setConta(conta); //Relacionando a conta
		
		
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin(); //Faz a conexao com o banco
		
		
		
		//Realizando a persistencia. Insert
		em.persist(cliente);

		
		
		em.getTransaction().commit();
		em.close();
		
		

	}//main

}//class
