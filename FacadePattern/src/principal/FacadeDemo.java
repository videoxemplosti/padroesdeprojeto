package principal;

import facade.CriandoForma;

public class FacadeDemo {

	
	public static void main(String[] args){
		
		CriandoForma criaForma = new CriandoForma();

	      criaForma.criarQuadrilatero();
	      criaForma.criarHexagono();
	}
}
