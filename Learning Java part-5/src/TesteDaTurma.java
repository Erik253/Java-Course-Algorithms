//Using an Array declared in another class
//Using the command "length"


public class TesteDaTurma {
	
	public static void main(String[] args){
		
		Turma turma1  = new Turma();
		turma1.alunos = new Aluno[2]; // Array não é um tipo primitivo, por isso deve ser declarado para ser usado
		
		
		//Colocar valores no objeto turma1
		turma1.alunos[0] = new Aluno(); // Dizendo para o java que a posição 0 do array existe
		turma1.alunos[0].nome = "Erik";
		turma1.alunos[0].nota = 10;
		
		
		turma1.alunos[1] = new Aluno(); // Dizendo para o java que a posição 0 do array existe
		turma1.alunos[1].nome = "Joao";
		turma1.alunos[1].nota = 9;
		
		
		turma1.showValues();


	
		
	}
}
