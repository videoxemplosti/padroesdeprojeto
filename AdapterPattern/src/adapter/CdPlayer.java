package adapter;

public class CdPlayer implements TocadorAvancado{

	@Override
	public void tocarVinil(String nomeDisco) {
		// Nada a ser feito
		
	}

	@Override
	public void tocarCd(String nomeDisco) {
		System.out.println("Tocando um CD de nome "+nomeDisco);
		
	}

}
