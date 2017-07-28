package modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity  //Isso eh uma anotacao do Hibernate, no qual estou dizendo que essa classe reprenta um tabela do banco de dados
public class Categoria {
	
	
	@Id //Anotacao do Hibernate, no qual estou dizendo que o campo "id" eh o campo chave da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Anotacao do Hibernate que diz que o campo "id" campo eh Auto-incrementado.E o "Strategy" eh pra dizer como que vai ser esse auto-incremento, que nesse caso vai ser de um em um
	private Integer id;
	
	private String nome;

	
	
	//Construtor
	public Categoria(String nomeRecebido) {
		nome = nomeRecebido;
	}
	
	
	
	public Categoria() {
	}
	
	
	
	
	
	
	
	
	//------------------Getters and Setters------------------//

	public Integer getId() {
		return id;
	}

	
	
	public void setId(Integer id) {
		this.id = id;
	}

	
	
	public String getNome() {
		return nome;
	}

	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}//class
