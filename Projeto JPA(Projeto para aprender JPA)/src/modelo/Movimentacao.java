package modelo;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity  //Isso eh uma anotacao do Hibernate, no qual estou dizendo que essa classe reprenta um tabela do banco de dados
public class Movimentacao {

	
	@Id //Anotacao do Hibernate, no qual estou dizendo que o campo "id" eh o campo chave da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Anotacao do Hibernate que diz que o campo "id" campo eh Auto-incrementado.E o "Strategy" eh pra dizer como que vai ser esse auto-incremento, que nesse caso vai ser de um em um
	private Integer id;
	
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING) //Anotacao do Hibernate, no qual estou dizendo que eh de um tipo de classe "enum" e as opcoes de valores sao String
	private TipoMovimentacao tipo;//Essa variavel so pode receber os valores definidos na classe "TipoMovimentacao"
	
	
	@Temporal(TemporalType.TIMESTAMP)//Anotacao do Hibernate, dizendo que se trata de um campo temporal(no qual pode variar de banco pra banco) e que vai o valor do campo vai ser TIMESTAMP(data e hora)
	private Calendar data;
	
	
	@ManyToOne            //Anotacao do Hibernate, dizendo esse campo eh uma chave estrangeira de relacionamento "n pra 1"
	private Conta conta;  //Seria a mesma coisa de fazer a query:   Select * from Conta  where o id = "O id da conta associado"
	
	
	@ManyToMany //Anotacao do Hibernate, dizendo esse campo eh uma chave estrangeira de relacionamento "N pra N", A relacionamento eh: "1 Movimentacao pode ter N Categorias", "1 categoria por ser de N Movimentacaoes"
	private List<Categoria> categoria;

	
	
	

	//--------------Getters and Setters--------------//
	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	
}//class
