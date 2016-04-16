package proxy;

public class TipoRealAudio implements AudioIF{
	
	private String  nomeArquivo;

	public TipoRealAudio(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
		carregandoArquivo(nomeArquivo);
	}
	
	public void play() {
		System.out.println("Tocando o arquivo de nome "+nomeArquivo);
		
	}
	
	public void carregandoArquivo(String nomeArquivo){
		System.out.println("Carregando arquivo "+nomeArquivo+" do disco.");
	}

	
	
	
}
