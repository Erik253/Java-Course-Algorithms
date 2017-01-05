//Goal: Doing a connection with hsqldb

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Creating a connection with hsqldb
// 1) Putting the hsqldb.jar into the projetc
// 2) Add "build path to hsqldb.jar


public class TestaConexao {
	
	public static void main(String args[]) throws SQLException{
		
		//How to do a connection - Step by step
		//1 - Uso o metodo "getConnection" que esta na classe "DriverManager". Esse metodo eh static e retorno uma "Connection"
		//2 - Crio uma variavel do tipo "Connection" para receber o retorno do metodo que chamei
		//3 - Adiciono "throws SQLException" ou seja, se der alguma SQL exception pare o programa
		//4 - Feito!
		                                                     
															 //   |   Qual banco   | |Endereco||nome do banco| |Usuario e senha|         	
		Connection variavelDeConexao = DriverManager.getConnection("jdbc:hsqldb:hsql//localhost/BancoDeDados1","SA","");
		System.out.println("The connection is done :)");
		
		
		variavelDeConexao.close(); //Closing the connection
		System.out.println("The connection is closed :)");
		
		
	}//main
}//TestaConexao
