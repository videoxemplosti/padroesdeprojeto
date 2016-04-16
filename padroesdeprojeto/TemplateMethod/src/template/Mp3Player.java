package template;

public class Mp3Player extends Player{

	@Override
	public void play() {
		System.out.println("Executando uma música MP3...");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando música MP3...");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avançando música MP3...");
		
	}

	
}
