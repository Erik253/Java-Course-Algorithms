//Using an Array declared in another class
//Using the command "length"


public class TesteDaTurma {
	
	public static void main(String[] args){
		
		Turma turma1 = new Turma();
		turma1.notas = new int[10]; // Array não é um tipo primitivo, por isso deve ser declarado para ser usado
		
		int j=0;
		
		//Fill with values
		for (int i=0; i<10; i++){
			turma1.notas[i] = j;
			j++;
				}

		//show values
		turma1.showValues();
	
		
	}
}
