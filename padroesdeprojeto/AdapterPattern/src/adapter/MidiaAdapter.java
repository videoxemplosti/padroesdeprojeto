package adapter;

public class MidiaAdapter implements TocadorBasico{

	
	TocadorAvancado tocadorAdv;
	
	public MidiaAdapter(String tipoMidia){
		if(tipoMidia.toUpperCase().equals("CD")){
			tocadorAdv = new CdPlayer();
		} else if (tipoMidia.toUpperCase().equals("VINIL")){
			tocadorAdv = new VinilPlayer();
		}
		
	}
	
	@Override
	public void tocar(String tipoMidia, String nomeArquivo) {
		
		if(tipoMidia.toUpperCase().equals("CD")){
			tocadorAdv.tocarCd(nomeArquivo);
		} else if (tipoMidia.toUpperCase().equals("VINIL")){
			tocadorAdv.tocarVinil(nomeArquivo);
		}
		
	}

}
