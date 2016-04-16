package prototype;

import java.util.Hashtable;

public class CalcaCache {
	
	private static Hashtable<String, Calca> calcaCache = new Hashtable<String, Calca>();
	
	
	/*
	 * Recuperando do cache calças clonadas
	 */
	public static Calca getCalca(String calcaId) {
	      Calca cache = calcaCache.get(calcaId);
	      return (Calca) cache.clone();
	}

	   /*
	    * Criando diferentes tipos de calça e adicionando em cache.
	    */
	   
	   public static void loadCache() {
	      Jeans calcaJeans = new Jeans();
	      calcaJeans.setId("jeans");
	      calcaCache.put(calcaJeans.getId(),calcaJeans);

	      JeansEstampada estampa = new JeansEstampada();
	      estampa.setId("estampada");
	      calcaCache.put(estampa.getId(),estampa);

	      JeansStretch stretch = new JeansStretch();
	      stretch.setId("stretch");
	      calcaCache.put(stretch.getId(), stretch);
	   }
	
	

}
