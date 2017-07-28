package util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	
	
	//"private static" -> Diz que so eh possivel ter uma instancia dessa classe na memoria por vez
	//"EntityManagerFactory" eh um objeto que so serve para criar um objeto do tipo "EntityManager"
	//----------------------------------------------------------------------------->(Definicao no arquivo "persistence.xml" com name="financas"
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");

	
	
	public EntityManager getEntityManager() {
		
		//"EntityManager" eh um tipo de objeto que tem metodos para realizar as operacoes no banco
		return emf.createEntityManager();
		
		
	}//getEntityManager
	
	
	
	
}//class
