
public class Cliente implements PessoaAutenticavel{ //O comando "implements" faz com que seja obrigatorio
	 													 //implementar os metodos que estão descritos na interfaceDeAutenticacao

	String nome;
	int senha =123;

	
	
	public void setNome(String nomeRecebido){
		
		this.nome = nomeRecebido;
		
	}//SetNome
	
	
	
	public String getNome(){
		
		return this.nome;
		
	}//getNome
	
	
	
	
	public void validarSenha(int senhaRecebida){//sou obrigado a implementar esse metodo, pois ele veio da interface "PessoaAutenticavel"
		
		if (this.senha == senhaRecebida ){
			System.out.println("Acesso concedido");
		}else{
			System.out.println("Senha incorreta");
		}//else
		
	}//ValidarSenha

	
}
