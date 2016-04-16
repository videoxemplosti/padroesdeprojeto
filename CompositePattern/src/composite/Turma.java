package composite;

import java.util.ArrayList;

public class Turma {

	
	private String idTurma;
	private ArrayList<Aluno> listaAlunos;
	
	
	public Turma(String id){
		this.idTurma = id;
		listaAlunos = new ArrayList<Aluno>();
	}
	
	public void adicionaAluno(Aluno alunoNovo) {
	      listaAlunos.add(alunoNovo);
	   }

	   public void removeAluno(Aluno alunoRemovido) {
	      listaAlunos.remove(alunoRemovido);
	   }

	   public ArrayList<Aluno> getListaAlunos(){
	     return listaAlunos;
	   }
	   
	   public String getIdTurma(){
		   return idTurma;
	   }
}
