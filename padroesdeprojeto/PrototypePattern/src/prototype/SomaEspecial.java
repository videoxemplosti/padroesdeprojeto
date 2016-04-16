package prototype;

public class SomaEspecial implements CalculadoraIF{

	@Override
	public int somarTaxaEspecial(int num1, int num2) {
		
		System.out.println("Somando com taxa especial...");
		int resultado = num1 * (2*num1) + num2;
		
		return resultado;
	}

	
	
}
