package modelo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity  //Isso eh uma anotacao do Hibernate, no qual estou dizendo que essa classe reprenta um tabela do banco de dados
public class Conta {
	
	
	@Id //Anotacao do Hibernate, no qual estou dizendo que o campo "id" eh o campo chave da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Anotacao do Hibernate que diz que o campo "id" campo eh Auto-incrementado.E o "Strategy" eh pra dizer como que vai ser esse auto-incremento, que nesse caso vai ser de um em um
	private Integer id;
	private String  titular;
	private String  numero;
	private String  banco;
	private String  agencia;
	
	
	/*Esse campo aqui corresponder a seguinte query:   select * from Movimentacoes   where conta_id = "o id desse objeto"   
	  Com essas anotacoes,  hibernate sabe disso sozinho.  
	  Essa anotacao "mappedBy" significa que ja tem um relacionamento mapeado entre "Conta" e "Movimentacao"
	*/
	@OneToMany(mappedBy="conta")
	private List<Movimentacao> movimentacoes;
	
	
	
	
	//-------Getters and Setters-------//
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
	
	
	
	//Retorna quantas movimentacoes a conta tem
	public List<Movimentacao> getMovimentacoes() {
		
		
		//retorna o atributo da classe
		return movimentacoes;
		
	}//


}//class
