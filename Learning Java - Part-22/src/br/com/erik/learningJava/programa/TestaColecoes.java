package br.com.erik.learningJava.programa;

import java.util.ArrayList;
import java.util.Collections;

import br.com.erik.learningJava.modelo.Conta;

public class TestaColecoes {
	
	public static void main(String[] args){
		
		ArrayList<String> nomes = new ArrayList<String>();  //Criando uma ArrayList que so aceita Strings

		nomes.add("Mauricio");  //Adicionando um valor
		nomes.add("Guilherme"); //Adicionando um valor
		
		System.out.println("Imprimindo nomes[0] = " +nomes.get(0) ); //Imprimindo o valor da posicao 0
		System.out.println("Contem a String 'Guilherme na colecao? - "  +nomes.contains("Guilherme") ); // Verificando se existe a String "Guilherme dentro de alguma posicao da colecao
		
		System.out.println("__________________________________________________");		
		System.out.println("Ordenando por ordem alfabetica a colecao nomes");
		Collections.sort(nomes);	//Ordenando por ordem alfabetica a colecao
		
		System.out.println("__________________________________________________");		
		System.out.println("Imprimindo todos os elementos da colecao nomes:");
		//Laco para imprimir todos os elementos da ArrayList na ordem do primeiro para ultimo/jeito1
		for(int i=0; i< nomes.size(); i++){
			System.out.println(  nomes.get(i) );
		}//for
		
				
		System.out.println("__________________________________________________");		
		System.out.println("Imprimindo todos os elementos da colecao nomes:");		
		//Laco para imprimir todos os elementos da ArrayList na ordem do primeiro para ultimo/jeito2
		for( String auxiliar : nomes  ){ //Para cada posicao dentro da colecao nomes, faca:
			System.out.println(auxiliar);		
		}//for
		
		
		
		
		ArrayList<Conta> contas = new ArrayList<Conta>(); //Criando uma ArrayList que so aceita objetos da classe Conta
		Conta c1 = new Conta(1500);     
		Conta c2 = new Conta(700);	   
		
		contas.add(c1);     //Adicionando um objeto na ArrayList
		contas.add(c2);		//Adicionando um objeto na ArrayList
		
		System.out.println("__________________________________________________");		
		System.out.println("Ordenando por ordem de menor saldo a colecao contas");
		Collections.sort(contas); //Ordenando a colecao por uma ordem definida de saldo
		                          //A ordenenacao foi descrita no metodo compareTo na classe conta
		
		
		System.out.println("__________________________________________________");		
		System.out.println("Imprimindo todos os elementos da colecao contas:");		
		
		//Laco para imprimir todos os elementos da ArrayList na ordem do primeiro para ultimo		
		for( Conta auxiliar : contas){//Para cada posicao dentro da colecao contas, faca:
			System.out.println(auxiliar);
		}//for
		
		
		
		
		
		
		
		
		
	}//main
}
