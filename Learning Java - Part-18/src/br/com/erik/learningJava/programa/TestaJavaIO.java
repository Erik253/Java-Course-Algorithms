package br.com.erik.learningJava.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class TestaJavaIO {
	
	public static void main(String[] args) throws IOException{      //Tratamento de erro de input e output de arquivo
		
		InputStream       is  = new FileInputStream("leitura.txt"); //Declaracao do arquivo
		InputStreamReader isr = new InputStreamReader(is);          //Declaracao do leitor do arquivo		
		BufferedReader    br  = new BufferedReader(isr);            //Declaracao buffer do leitor do arquivo
		
		OutputStream       os  = new FileOutputStream("saida.txt"); //Declaracao do arquivo
		OutputStreamWriter osw = new OutputStreamWriter(os);        //Declaracao do escritor do arquivo	
		BufferedWriter     bw  = new BufferedWriter(osw);           //Declaracao buffer do escritor do arquivo
		
		
		String linha = br.readLine(); //String que recebe o buffer, lendo a primeira linha do arquivo
		
		while(linha !=null){          //Enquanto o arquivo nao for vazio
			bw.append(linha);         //Adicionar conteudo da variavel linha no arquivo de saida
			bw.newLine();			  //Adicionar um pulo de linha no arquivo
			linha = br.readLine();    //Ler proxima linha do arquivo
			}
	    br.close();
	    bw.close();
	    
	    System.out.println("Verifique o resultado no arquivo de saida: 'saida.txt' ");
	}//Main

}//
