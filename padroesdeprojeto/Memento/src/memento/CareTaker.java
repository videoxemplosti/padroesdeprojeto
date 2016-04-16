package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoLista = new ArrayList<Memento>();

	   public void add(Memento estado){
	      mementoLista.add(estado);
	   }

	   public Memento get(int posicao){
	      return mementoLista.get(posicao);
	   }
	
}
