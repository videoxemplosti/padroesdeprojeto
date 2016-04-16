package principal;

import command.Broker;
import command.Deslocamento;
import command.MovimentoAndar;
import command.MovimentoCorrer;

public class DemoCommand {

	
	public static void main(String[] args){
		
		Deslocamento deslocar = new Deslocamento();
		
		MovimentoAndar movAndar = new MovimentoAndar(deslocar);
		MovimentoCorrer movCorrer = new MovimentoCorrer(deslocar);
		
		Broker br = new Broker();
		br.adicionaAcao(movAndar);
		br.adicionaAcao(movAndar);
		br.adicionaAcao(movAndar);
		br.adicionaAcao(movCorrer);
		br.adicionaAcao(movCorrer);
		br.executaAcao();
		
		
	}
	
}
