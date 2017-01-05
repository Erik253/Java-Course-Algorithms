//Using the command "length"

public class Turma {
	
	int[] notas;
	


	
	
	void showValues() {
		

		for (int i=0; i< this.notas.length; i++){ //Posso usar o length quando não sei o tamanho exato do array

			System.out.println("Array position [" +i+ "]: " +this.notas[i]);
			}//for
			
		
		
	}//showvalues
	
}//class




