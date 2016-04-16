package command;

import java.util.ArrayList;

public class Broker {

	
	private ArrayList<AcaoIF> listaAcoes = new ArrayList<AcaoIF>();
	
	/*
	 * Adiciona ações a serem executadas em uma ordem.
	 */
	public void adicionaAcao(AcaoIF acao){
		listaAcoes.add(acao);
	}
	
	
	/*
	 * Executa ações na ordem que foram inseridas na fila.
	 */
	public void executaAcao(){
		
		// Percorre a lista de ações executando os comandos.
		for (AcaoIF acao : listaAcoes){
			acao.executar();
		}
		
		
		// Limpa a lista de ações, permitindo que novos comandos sejam inseridos.		
		listaAcoes.clear();
		
	}
	
}
