package principal;

import factory.FlorFactory;
import factory.FlorIF;

public class DemoFactoryMethod {

	
	public static void main(String[] args){
		
		FlorFactory tipoFlor = new FlorFactory();
		
		FlorIF minhaFlor = tipoFlor.gerarFlor("rosa");
		minhaFlor.criarFlor();
		
		
		minhaFlor = tipoFlor.gerarFlor("margarida");
		minhaFlor.criarFlor();
		
		minhaFlor = tipoFlor.gerarFlor("orquidea");
		minhaFlor.criarFlor();
		
		
	}
}
