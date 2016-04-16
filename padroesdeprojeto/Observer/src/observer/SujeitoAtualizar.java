package observer;

import java.util.ArrayList;

public class SujeitoAtualizar {

	
	public ArrayList<Observer> listaObservadores = new ArrayList<Observer>();
	
	
	public void setNotificacao(){
		notificarObservadores();
	}
	
	
	public void addObserver(Observer observer){
		this.listaObservadores.add(observer);
	}
	
	public void notificarObservadores(){
		
		for(Observer observer : listaObservadores){
			observer.atualizarDados();
		}
	}
	
}
