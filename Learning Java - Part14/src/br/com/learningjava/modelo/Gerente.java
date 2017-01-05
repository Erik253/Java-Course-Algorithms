package br.com.learningjava.modelo;
import br.com.learningjava.interfaces.PessoaAutenticavel;

public class Gerente extends Funcionario implements PessoaAutenticavel{ //O comando "implements" faz com que seja obrigatorio
																			 //implementar os metodos que estão descritos na interfaceDeAutenticacao
	
	int senha=123;
	
	public double getBonus(){ //O metodo get Bonus eh "abstract" e veio da classe pai funcionario, e eh obrigatorio overrides
		                      //Sobre overriding o metodo getbonus() orignal da classe Funcionario
		return this.salario * 0.3;
						
	}//getBonus
	
	
	
	public void validarSenha(int senhaRecebida){ //sou obrigado a implementar esse metodo, pois ele veio da interface "PessoaAutenticavel"
		
		if (this.senha == senhaRecebida ){
			System.out.println("Acesso concedido");
		}else{
			System.out.println("Senha incorreta");
		}//else
		
	}//validarSenha



	
	
	
	

}//Gerente
