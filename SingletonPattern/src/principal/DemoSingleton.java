package principal;

import singleton.CarrinhoCompra;


public class DemoSingleton {

	public static void main(String[] args){
		
		System.out.println("Primeira chamada....");
		CarrinhoCompra meuCarrinho = new CarrinhoCompra();
		meuCarrinho.getInstance();
		
		System.out.println();
		System.out.println("Segunda chamada....");
				
		CarrinhoCompra meuCarrinho2 = new CarrinhoCompra();
		meuCarrinho2.getInstance();
		
	}
	
}


