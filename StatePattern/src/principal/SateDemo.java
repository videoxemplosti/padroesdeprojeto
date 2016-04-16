package principal;

import state.Contexto;
import state.EstadoInicial;
import state.EstadoPausado;

public class SateDemo {

	public static void main(String[] args) {

		
		Contexto context = new Contexto();

	      EstadoInicial estadoInicial = new EstadoInicial();
	      estadoInicial.fazerAcao(context);

	      EstadoPausado estadoPausado = new EstadoPausado();
	      estadoPausado.fazerAcao(context);


	}

}
