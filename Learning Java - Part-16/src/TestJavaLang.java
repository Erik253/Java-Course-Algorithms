
public class TestJavaLang {

	public static void main(String[] agrs){

		
		//Usando alguns metodos herdados da classe String
		String curso = "fj11";
		
		curso = curso.replace ("j", "k"); //Replace: Metodo para substituir caracteres
		curso = curso.toUpperCase();      //toUpperCase: Tudo para Maisculo
		System.out.println(curso);
		
		
		//
		double pi = 3.14;
		
		long numeroArredondado = Math.round(pi);
		System.out.println(numeroArredondado);
		
	}//main
	
	
}//class
