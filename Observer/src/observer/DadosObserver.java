package observer;

public class DadosObserver extends Observer{

	
	public DadosObserver(SujeitoAtualizar sujeito){
		this.subject = sujeito;
		this.subject.addObserver(this);
	}
	
	@Override
	public void atualizarDados() {
		
		System.out.println("Atualizando dados a partir de observer...");
		
	}
	
	

}
