package command;

public class MovimentoCorrer implements AcaoIF{

	private Deslocamento deslocar;
	
	public MovimentoCorrer(Deslocamento deslocar){
		this.deslocar = deslocar;
	}
	
	
	@Override
	public void executar() {
		this.deslocar.correr();
		
	}

	
	
}
