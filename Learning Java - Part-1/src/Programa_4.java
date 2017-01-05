//Using long variable
//Using float variable

public class Programa_4 {
	public static void main (String[] args){
		
		int numeroPequeno = 32000;
		long numeroGrande = 9999999999l; // it's necessary to put the letter "l" when I'm using long type
		System.out.println("Usando tipo int : " +numeroPequeno);
		System.out.println("Usando tipo long: " +numeroGrande);
				
		
		float outroPI = 314;
		double pi = 3.14;
		System.out.println("Usando tipo float : " +outroPI);
		System.out.println("Usando tipo double: " +pi);
		
		
		int numero = 1000;
		long copiaDeNumero = numero;               //tudo que cabe em um inteiro cabe o long
		int copiaDeNumero2 = (int) copiaDeNumero;  //Para colocar long dentro do int, é necessário colocar "(int)", mas o valor agregado pode zuar 
		System.out.println("Conversão incorreta: " +copiaDeNumero2);		
		
		
	}
	
}
