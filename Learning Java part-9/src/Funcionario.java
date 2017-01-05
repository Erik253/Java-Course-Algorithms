public abstract class Funcionario { //o comando "abstract" nao permite a criação de um objeto desse tipo
	                         //-só fica permitido criar um objeto extending dessa classe.
	
	private   String nome;
	protected double salario; //As classes filhas podem acessar esse atributo
	
	
	public abstract double getBonus();//O comnado "abstract" obriga as classes filhas a terem esse metodo
    //--ai tem que "overrides" o metodo na propria classe filha.	
	
	public String getNome(){
		return this.nome;
	}//getNome
		

	public void setNome(String nomeRecebido){
		this.nome = nomeRecebido;
	}//getNome
		
	
	public void setSalario(double salario){
		
		this.salario = salario;
	}//setSalario
                                  
	
}
