package observer;

public class AuditoriaObserver extends Observer{

	
	public AuditoriaObserver(SujeitoAtualizar sujeito){
		this.subject = sujeito;
		this.subject.addObserver(this);
	}
	
	@Override
	public void atualizarDados() {
		System.out.println("Atualizando auditoria a partir de observer...");
		
	}
	
	

}
