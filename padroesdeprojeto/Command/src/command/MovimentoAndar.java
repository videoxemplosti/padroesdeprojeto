package command;

public class MovimentoAndar implements AcaoIF{

	private Deslocamento deslocar;
	
	
	public MovimentoAndar(Deslocamento deslocar){
		this.deslocar = deslocar;
	}
	
	
	@Override
	public void executar() {
	
		this.deslocar.andar();
		
		
	}

	
	
}
