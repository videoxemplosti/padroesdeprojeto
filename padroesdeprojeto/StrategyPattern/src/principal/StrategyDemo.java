package principal;

import strategy.Contexto;
import strategy.Divisao;
import strategy.Soma;
import strategy.Subtracao;

public class StrategyDemo {

	public static void main(String[] args) {
		
		Contexto context = new Contexto(new Soma());
		System.out.println("Chamando soma ->"+ context.executaStrategy(10, 20));
		
		System.out.println();
		
		context = new Contexto(new Subtracao());
		System.out.println("Chamando subtrair ->"+context.executaStrategy(20, 5));
		
		System.out.println();
		
		context = new Contexto(new Divisao());
		System.out.println("Chamando divisão ->"+context.executaStrategy(20, 2));
				
		
		
		

	}

}
