package state;

public class Contexto {

	
	private EstadoIF estado;
	
	public Contexto(){
		estado = null;
	}
	
	public void setEstado(EstadoIF estado){
		this.estado = estado;
	}
	
	public EstadoIF getEstado(){
		return estado;
	}
}

