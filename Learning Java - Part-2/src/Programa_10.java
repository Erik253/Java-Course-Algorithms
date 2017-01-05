//simulação de conta bancaria
//Usando um object "Conta.java" com uma varivel do tipo Pessoa (que é uma variavel de uma outra classe)
//Usando metodos

public class Programa_10 {
			
	public static void main(String[] args){
		
		//Declaring an object
		Conta contaDoerik   = new Conta();
		contaDoerik.titular = new Pessoa(); //Declarando uma variavel do tipo pessoa.
                                            //Quando eu tenho classe que possui uma variavel composta, eu preciso declarar ela como objeto. doidera
		
				
		//Attributes variables
		contaDoerik.numero 					= 123;
		System.out.println("******"+contaDoerik.numero);
		contaDoerik.saldo   				= 500.00;
		contaDoerik.agencia 				= 001;
		
		contaDoerik.titular.nome       	    = "Erik";
		contaDoerik.titular.cpf        	    = "123456789";
		contaDoerik.titular.dataNascimento	= "25/10/1989";
		
		
		//Declaring an object
		Conta contaDojoao   = new Conta();
		contaDojoao.titular = new Pessoa(); //Declarando uma variavel do tipo pessoa.
		                                    //Quando eu tenho classe que possui uma variavel composta, eu preciso declarar ela como objeto. doidera
		
		//Attributes variables
		contaDojoao.numero 	= 456;
		contaDojoao.saldo   = 600.00;
		contaDojoao.agencia = 002;		
		
		contaDojoao.titular.nome       	    = "joao";
		contaDojoao.titular.cpf        	    = "987654321";
		contaDojoao.titular.dataNascimento	= "30/10/1989";
		
		
		//Mostrar saldo das contas
		System.out.println("Saldo atual das contas");
		System.out.println("Saldo do " +contaDoerik.titular.nome+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular.nome+ ": R$" +contaDojoao.saldo);		
		
		
		
		//Accessing a method - deposita
		contaDoerik.deposita(100.00);
		contaDojoao.deposita(100.00);		
		
		System.out.println("");
		System.out.println("Saldo atual das contas após deposito");		
		System.out.println("Saldo do " +contaDoerik.titular.nome+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular.nome+ ": R$" +contaDojoao.saldo);		
		
		
		//Accessing a method - sacar
		contaDoerik.sacar(100.00);
		contaDojoao.sacar(100.00);		
		
		System.out.println("");
		System.out.println("Saldo atual das contas após saque");		
		System.out.println("Saldo do " +contaDoerik.titular.nome+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular.nome+ ": R$" +contaDojoao.saldo);				


		//Accessing a method - transfere
		contaDoerik.transfere(100.00, contaDojoao);	
		
		System.out.println("");
		System.out.println("Saldo atual das contas após transferencia");		
		System.out.println("Saldo do " +contaDoerik.titular.nome+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular.nome+ ": R$" +contaDojoao.saldo);				

		
	}//main


}//Programa_10
