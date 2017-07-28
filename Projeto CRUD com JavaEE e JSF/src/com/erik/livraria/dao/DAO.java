package com.erik.livraria.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class DAO<ClasseRecebida> {

	private final Class<ClasseRecebida> classe;

	
	public DAO( Class<ClasseRecebida> classeRecebida ) {		
		classe = classeRecebida;
	}

	
	public void adiciona( ClasseRecebida objetoRecebido ) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(objetoRecebido);
		em.getTransaction().commit();
		em.close();	
	}


	public void remove( ClasseRecebida objetoRecebido ) {
		

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.remove( em.merge(objetoRecebido) );
		em.getTransaction().commit();
		em.close();
	}

	
	public void atualiza( ClasseRecebida objetoRecebido ) {
		

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.merge(objetoRecebido);
		em.getTransaction().commit();
		em.close();
	}

	
	public List<ClasseRecebida> listaTodos() {

		EntityManager em = new JPAUtil().getEntityManager();
		
		CriteriaQuery<ClasseRecebida> query = em.getCriteriaBuilder().createQuery(classe);
		query.select( query.from(classe) );

		List<ClasseRecebida> lista = em.createQuery(query).getResultList();

		
		em.close();
		
		return lista;
	}

	
	public ClasseRecebida buscaPorId( Integer id ) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		ClasseRecebida instancia = em.find(classe, id);
		
		em.close();
		
		return instancia;
	}
	
	
	public int contaTodos() {
		
		EntityManager em = new JPAUtil().getEntityManager();
		long result = (Long) em.createQuery( "select count(n) from livro n" ).getSingleResult();
		
		em.close();

		return (int) result;
	}
	

	public List<ClasseRecebida> listaTodosPaginada( int firstResult, int maxResults ) {
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		CriteriaQuery<ClasseRecebida> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));

		
		List<ClasseRecebida> lista = em.createQuery(query).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();

		
		em.close();
		
		
		return lista;
	}
	

}
