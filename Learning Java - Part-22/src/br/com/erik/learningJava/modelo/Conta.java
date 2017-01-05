package br.com.erik.learningJava.modelo;
//

public class Conta implements Comparable<Conta>{

	private double saldo; // Só permite acesso via metodos
	Cliente titular;


	
	public Conta(double SaldoInicial) {
		this.saldo = SaldoInicial;
	}// Construtor 1

	
	public double getSaldo() {
		System.out.println("------------------------");
		System.out.println("Pega Saldo");
		return this.saldo;
	}// pegaSaldo



	@Override
	//Esse metodo eh responsavel por retornar uma String de um objeto 
	//- quando eu uso so 'System.out.println(objeto)
	//- Assim, eu posso sobreescrever e devolver o que eu quiser quando eu usar o System.out.println
	public String toString() { // Metodo Herdado da classe mae "Object"
								// Sobreescrevendo o metodo
		return "Conta com saldo " + this.saldo;
	}// toString

	
	@Override
	//Metodo para ordenar as contas dentro de uma colecao em ordem de saldo
	//Esse metodo foi sobreescrito, pois ele eh usado pelo metodo statico Collections.sort()
	//Doideira para entender
	public int compareTo(Conta outraConta) {
		
		if(this.saldo < outraConta.saldo) 
			{return -1;}
		
		if(this.saldo > outraConta.saldo)
			{return 1;}
		
		return 0;
		
	}


	
}// Conta
