package br.com.erik.learningJava.programa;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class TestaJavaIO {
	
	public static void main(String[] args) throws IOException{      //Tratamento de erro de input e output de arquivo
		
		Scanner     sc = new Scanner(new FileInputStream("leitura.txt")); //Declarando o arquivo de entrada //classe Scanner importada do pacote java.util 		                                                             
		PrintStream ps = new PrintStream("saida.txt");                    //Declarando o arquivo de saida   //classe PrintStream importada do pacote java.io
	    															  
		
		while( sc.hasNextLine() ){         //O metodo boolean hasNextLine() return true se houver uma proxima linha
			String linha = sc.nextLine();  //Lendo uma linha do arquivo de entrada
			ps.println(linha);			   //Escrevendo no arquivo de saida
			
		}//while
		
		ps.close(); //Fechando file de saida
		sc.close(); //Fechando file de entrada
	    
	}//Main

}//
