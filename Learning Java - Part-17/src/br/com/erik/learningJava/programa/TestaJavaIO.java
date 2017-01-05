package br.com.erik.learningJava.programa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TestaJavaIO {
	
	public static void main(String[] args) throws IOException{      //Tratamento de erro de input e output de arquivo
		
		InputStream       is  = new FileInputStream("leitura.txt"); //Declaracao do arquivo
		InputStreamReader isr = new InputStreamReader(is);          //Declaracao do leitor do arquivo		
		BufferedReader    br  = new BufferedReader(isr);            //Declaracao buffer do leitor do arquivo
		
		String linha = br.readLine(); //String que recebe o buffer, lendo a primeira linha do arquivo
		
		while(linha !=null){          //Enquanto o arquivo nao for vazio
			System.out.println(linha);
			linha = br.readLine();
			}
	    br.close();
	}//Main

}//
