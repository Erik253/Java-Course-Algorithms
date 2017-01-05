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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	
		
	@Override
	//Metodo para ordenar as contas dentro de uma colecao em ordem de saldo
	//Esse metodo foi sobreescrito, pois ele eh usado pelo metodo statico Collections.sort()
	//Doideira para entender
	public int compareTo(Conta outraConta) {
		
		if(this.saldo < outraConta.saldo) 
			{return -1;} //Fica uma posicao atras lugar dentro da collection
		
		if(this.saldo > outraConta.saldo)
			{return 1;} //Fica na frente dentro da collection
		
		return 0; //Fica no mesmo lugar dentro da collection
		
	}


	//Esse metodo eh de Colecoes do tipo 'Set'
	//Esse metodo serve para definir como vai ser comparado um novo objeto adicionado na colecao com os objetos que ja estao la
	//Por exemplo: Eu quero dizer que so vai ser adicionado na colecao se o objeto tiver o saldo diferente do que ja estao na colecao
	//O bom eh que eu posso definir o que deve ser comparado.Phoda para lembrar :/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
}// Conta
