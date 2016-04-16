package facade;

public class CriandoForma {

	 private FormaIF hexagono;
	   private FormaIF quadrilatero;

	   public CriandoForma() {
		   hexagono = new Hexagono();
		      quadrilatero = new Quadrilatero();
		      
	   }

	   public void criarHexagono(){
		   hexagono.desenhar();
	   }
	   public void criarQuadrilatero(){
		   quadrilatero.desenhar();
	   }
	   
}
