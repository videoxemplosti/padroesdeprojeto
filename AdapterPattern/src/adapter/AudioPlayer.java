package adapter;

public class AudioPlayer implements TocadorBasico{
	
	MidiaAdapter midia;

	@Override
	public void tocar(String tipoMidia, String nomeArquivo) {
		
		if(tipoMidia.equalsIgnoreCase("cd")){
			midia = new MidiaAdapter(tipoMidia);
			midia.tocar(tipoMidia, nomeArquivo);
		} else if (tipoMidia.equalsIgnoreCase("vinil")){
			midia = new MidiaAdapter(tipoMidia);
			midia.tocar(tipoMidia, nomeArquivo);
		}
		
	}

}
