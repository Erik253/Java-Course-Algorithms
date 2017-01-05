package br.com.erik.learningJava.programa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.erik.learningJava.modelo.Conta;

public class TestaColecoes {
	
	public static void main(String[] args){
		
		List<String> nomes = new LinkedList<String>();  //Criando uma Colecao que so aceita Strings
														//Colecao do tipo List permite elementos repetidos sejam armazenados
		nomes.add("Mauricio");  //Adicionando um valor
		nomes.add("Guilherme"); //Adicionando um valor
		nomes.add("Guilherme"); //Adicionando um valor repetido
		
		System.out.println("------Colecao do tipo 'List'-'LinkedList' permite elementos repetidos sejam armazenados------");
		System.out.println("Tamanho da colecao: " +nomes.size());
	    for(String auxiliar : nomes)
	    	{
	    		System.out.println("nomes[]: " +auxiliar );
	    	}
		

	    
	    System.out.println("\n_________________________________________________________________________________\n");
	    
	    
	    
		Set<String> nomes1 = new HashSet<String>();  //Criando uma Colecao que so aceita Strings
		                                             //Colecao do tipo Set nao permite elementos repetidos sejam armazenados
													 //Se um elemento repetido for adicionado, nao vai dar erro, mas o elementos sera ignorado, evitando a duplicidade de dados
		nomes1.add("Mauricio");  //Adicionando um valor
		nomes1.add("Guilherme"); //Adicionando um valor
		nomes1.add("Guilherme"); //Adicionando um valor repetido

		System.out.println("------Colecao do tipo 'Set'-'HashSet' nao permite elementos repetidos sejam armazenados------");
		System.out.println("Tamanho da colecao: " +nomes1.size());
		for(String auxiliar : nomes1)
			{
				System.out.println("nomes1[]: " +auxiliar );
			}
	    
		
	    System.out.println("\n_________________________________________________________________________________\n");		
		
		
	    
		Set<Conta> contas = new HashSet<Conta>();   //Criando uma Colecao que so aceita objetos do tipo Conta
                                                    //Colecao do tipo Set nao permite elementos repetidos sejam armazenados
		                                            //Se um elemento repetido for adicionado, nao vai dar erro, mas o elementos sera ignorado, evitando a duplicidade de dados
		Conta c0 = new Conta(500.0);
		Conta c1 = new Conta(200.0);
		Conta c2 = new Conta(500.0);		
		
		contas.add(c0);	//Adicionando um objeto na colecao	
		contas.add(c1);	//Adicionando um objeto na colecao	
		contas.add(c2); //Adicionando um objeto na colecao
		contas.add(c2); //Adicionando um objeto repetido na colecao. Porem, sobreescrevi o metodo 'public int hashCode()' que defini como  eh feita a 
		                //- verificacao se trata-se de um objeto repetido ou nao. Ver o que fiz na classe Conta
		
		
		System.out.println("------Colecao do tipo 'Set'-'HashSet' nao permite elementos repetidos sejam armazenados------");
		System.out.println("------Nesse exemplo o saldo esta sendo usado para realizar a comparacao se eh um objeto repetido ou nao------");
		System.out.println("Tamanho da colecao: " +contas.size());
		for (Conta auxiliar : contas)
			{
				System.out.println("contas[]: " +auxiliar);
			}

				
	    System.out.println("\n_________________________________________________________________________________\n");		
		
		
		Map<String, Conta> contas1 = new HashMap<String, Conta>();
		
		Conta x1 = new Conta(100);
		Conta x2 = new Conta(200);
		Conta x3 = new Conta(300);
		
		contas1.put("Primeira", x1); //Adicionado um objeto e dizendo que a chave ai ser uma String com o texto 'Primeira'
		contas1.put("Segunda" , x2); //Adicionado um objeto e dizendo que a chave ai ser uma String com o texto 'Segunda'
		contas1.put("Terceira", x3); //Adicionado um objeto e dizendo que a chave ai ser uma String com o texto 'Terceira'
		
		
		System.out.println("------Colecao do tipo 'Map'-'HashMap' Permite armazenar elementos com uma chave------");
		System.out.println("------ai com essa chave eu posso realizar um get usado a chave especifica------");
		System.out.println("Tamanho da colecao: " +contas1.size());


		System.out.println("\nExemplo de busca pela chave:");
		System.out.println( contas1.get("Primeira") ); //Pegando o elemento na colecao pela chave
		System.out.println( contas1.get("Segunda" ) ); //Pegando o elemento na colecao pela chave
		System.out.println( contas1.get("Terceira") ); //Pegando o elemento na colecao pela chave
		


		
	    
	    
	}//main
}
