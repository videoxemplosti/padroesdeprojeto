package template;

public abstract class Player {

	
	public abstract void play();
	public abstract void stop();
	public abstract void avancar(); 
	
	
	public final void executar(){
		
		//Inicia com play
		play();
		
		//Avança
		avancar();
		
		//Chama Stop
		stop();
	}
}
