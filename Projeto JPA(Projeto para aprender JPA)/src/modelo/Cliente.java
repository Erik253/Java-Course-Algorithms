package modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity  //Isso eh uma anotacao do Hibernate, no qual estou dizendo que essa classe reprenta um tabela do banco de dados
public class Cliente {

	
	
	
	@Id //Anotacao do Hibernate, no qual estou dizendo que o campo "id" eh o campo chave da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Anotacao do Hibernate que diz que o campo "id" campo eh Auto-incrementado.E o "Strategy" eh pra dizer como que vai ser esse auto-incremento, que nesse caso vai ser de um em um
	private Integer id;	

	
	private String nome;
	private String profissao;
	private String endereco;

	@JoinColumn(unique=true)//Anotacao do Hibernate, que esse relacionamento tem que ser unico
	@OneToOne //Anotacao do Hibernate, dizendo esse campo eh uma chave estrangeira de relacionamento "1 pra 1", A relacionamento eh: "1-Conta pode ser de 1-Cliente" -> 1 pra 1, "1-Cliente por ter 1-Conta" -> 1 pra 1
	private Conta  conta;

	
	
	
	///----------Getters and Setters------------///
	
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
	
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
}//class
