//Using an object "Conta.java"
//Using attributes

public class Programa_9 {
			
	public static void main(String[] args){
		
		//Declaring an object
		Conta contaDoerik = new Conta();
		
		//Attributes variables
		contaDoerik.numero 	= 123;
		contaDoerik.titular = "Erik Lima";
		contaDoerik.saldo   = 500.00;
		contaDoerik.agencia = 001;
		
		
		//Declaring an object
		Conta contaDojoao = new Conta();
		
		//Attributes variables
		contaDojoao.numero 	= 456;
		contaDojoao.titular = "Joao";
		contaDojoao.saldo   = 600.00;
		contaDojoao.agencia = 002;		
		
		
		System.out.println("Saldo atual das contas");
		System.out.println("Saldo do " +contaDoerik.titular+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular+ ": R$" +contaDojoao.saldo);		
		
		
		
		//Accessing a method - deposita
		contaDoerik.deposita(100.00);
		contaDojoao.deposita(100.00);		
		
		System.out.println("");
		System.out.println("Saldo atual das contas após deposito");		
		System.out.println("Saldo do " +contaDoerik.titular+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular+ ": R$" +contaDojoao.saldo);		
		
		
		//Accessing a method - sacar
		contaDoerik.sacar(100.00);
		contaDojoao.sacar(100.00);		
		
		System.out.println("");
		System.out.println("Saldo atual das contas após saque");		
		System.out.println("Saldo do " +contaDoerik.titular+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular+ ": R$" +contaDojoao.saldo);				


		//Accessing a method - transfere
		contaDoerik.transfere(100.00, contaDojoao);	
		
		System.out.println("");
		System.out.println("Saldo atual das contas após transferencia");		
		System.out.println("Saldo do " +contaDoerik.titular+ ": R$" +contaDoerik.saldo);
		System.out.println("Saldo do " +contaDojoao.titular+ ": R$" +contaDojoao.saldo);				

		
	}//main


}//Programa_9
