package br.com.erik.learningJava.programa;

import java.util.ArrayList;

import br.com.erik.learningJava.modelo.Conta;

public class TestaColecoes {
	
	public static void main(String[] args){
		
		ArrayList nomes = new ArrayList();  //Criando uma ArrayList generica

		nomes.add("Mauricio");  //Adicionando um valor
		nomes.add("Guilherme"); //Adicionando um valor
		
		System.out.println( nomes.get(0) ); //Imprimindo o valor da posicao 0
		System.out.println( nomes.contains("Guilherme") ); // Verificando se existe a String "Guilherme dentro de alguma posicao da colecao
		
		
		ArrayList contas = new ArrayList(); //Criando uma ArrayList generica
		Conta c1 = new Conta(500);     
		Conta c2 = new Conta(700);	   
		
		contas.add(c1);     //Adicionando um objeto na ArrayList
		contas.add(c2);		//Adicionando um objeto na ArrayList
		
		System.out.println( contas.get(0) );  //Imprimindo o valor da posicao 0 no console
		System.out.println( contas.get(1) );  //Imprimindo o valor da posicao 1 no console
	}//main
}
