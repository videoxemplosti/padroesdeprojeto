package principal;

import prototype.Calca;
import prototype.CalcaCache;

public class PrototypeDemo {

	 public static void main(String[] args) {
	      CalcaCache.loadCache();

	      Calca calcaClonada = (Calca) CalcaCache.getCalca("jeans");
	      System.out.println("Calca clonada ->"+ calcaClonada.getTipo());		

	      Calca calcaClonada2 = (Calca) CalcaCache.getCalca("estampada");
	      System.out.println("Calça clonada : " + calcaClonada2.getTipo());		

	      Calca calcaClonada3 = (Calca) CalcaCache.getCalca("stretch");
	      System.out.println("Calça clonada: " + calcaClonada3.getTipo());		
	   }
	
}
