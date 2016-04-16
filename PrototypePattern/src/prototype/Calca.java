package prototype;

public abstract class Calca implements Cloneable{
	
	private String id;
	protected String tipo;
	
	public abstract void criarModelo();

	public String getTipo() {
		return tipo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	 public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
	
	

}
