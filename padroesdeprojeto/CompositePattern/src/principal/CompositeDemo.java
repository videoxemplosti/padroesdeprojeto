package principal;

import composite.Aluno;
import composite.Turma;

public class CompositeDemo {

	
	public static void main(String[] args){
		 Aluno aluno1 = new Aluno("John",30000);
		 
		 Aluno aluno2 = new Aluno("Maria",12345);
		 
		 Aluno aluno3 = new Aluno("Arso",4000);


		 Turma novaTurma = new Turma("2016.1A");
		 novaTurma.adicionaAluno(aluno1);
		 novaTurma.adicionaAluno(aluno2);
		 novaTurma.adicionaAluno(aluno3);
		 
		 
		 Aluno aluno4 = new Aluno("Martin",50000);
		 Aluno aluno5 = new Aluno("Carl",60000);
		 
		 novaTurma.adicionaAluno(aluno4);
		 novaTurma.adicionaAluno(aluno5);
		 
		 novaTurma.removeAluno(aluno1);
		 novaTurma.removeAluno(aluno2);
		 
		 
		 
	     System.out.println("Alunos da turma "+novaTurma.getIdTurma());
	     
	      for (Aluno aluno : novaTurma.getListaAlunos()) {
	         System.out.println(aluno.getNome() + "  "+ aluno.getMatricula());
	         
	      }
	}
}

