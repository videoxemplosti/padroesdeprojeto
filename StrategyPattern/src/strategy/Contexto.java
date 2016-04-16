package strategy;

public class Contexto {

	private CalculadoraIF strategy;
	
	public Contexto(CalculadoraIF calculadora){
		this.strategy = calculadora;
	}
	
	public int executaStrategy(int num1, int num2){
		return strategy.operacao(num1, num2);
	}
	
}
