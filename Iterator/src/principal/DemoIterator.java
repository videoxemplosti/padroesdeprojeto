package principal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import aluno.AlunoVO;

public class DemoIterator {

	public static void main(String[] args) {
		
		ArrayList<AlunoVO> listaAluno = new ArrayList<AlunoVO>();
		AlunoVO aluno = null;
		
		//Alimentando a coleção com objetos AlunoVO
		for (int i=0; i<10; i++){
			listaAluno.add(new AlunoVO("Aluno"+i,"Endereco"+i,i));			
		}
		
		System.out.println();
		System.out.println();
		
		//Aplicando o padrão Iterator
		Iterator<AlunoVO> itrAluno = listaAluno.iterator();
		
		
		while(itrAluno.hasNext()){
			aluno = (AlunoVO) itrAluno.next();
			
			System.out.println("Nome: "+aluno.getNome());
			System.out.println("Endereço: "+aluno.getEndereco());
			System.out.println("Matrícula: "+aluno.getMatricula());
			System.out.println();
			System.out.println();
		}
		
		
		

	}

}
