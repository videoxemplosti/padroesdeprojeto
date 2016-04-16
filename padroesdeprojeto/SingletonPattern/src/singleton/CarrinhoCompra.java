package singleton;

public class CarrinhoCompra {
	
	private static	 CarrinhoCompra instanciaCarrinho;
	
	public CarrinhoCompra getInstance(){
		/* Caso ainda não tenha sido criada nenhuma instância de CarrinhoCompra, uma será criada e sempre
		 * a mesma instância será retornada.
		 */
		if(instanciaCarrinho == null){
			instanciaCarrinho = new CarrinhoCompra();
			System.out.println("Criando a instância pela primeira vez...");
		}else{
			//Mostrar que a instância é criada uma única vez.
			 System.out.println(" Uma instância já foi criada...");
		}
			
		return instanciaCarrinho;
	}
	

}
