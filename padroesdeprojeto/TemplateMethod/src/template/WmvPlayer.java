package template;

public class WmvPlayer extends Player{

	@Override
	public void play() {
		System.out.println("Executando um vídeo WMV...");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando um vídeo WMV...");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avançando um vídeo WMV...");
		
	}

}
