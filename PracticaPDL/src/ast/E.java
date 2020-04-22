package ast;

public abstract class E {
	   public abstract TipoE tipo(); 
	   public E opnd1() {throw new UnsupportedOperationException("opnd1");} 
	   public E opnd2() {throw new UnsupportedOperationException("opnd2");}
	   public abstract String imprime(String prev, boolean barra);
	   public String num() {throw new UnsupportedOperationException("num");}
	   private boolean asignable;
		public E(boolean asignable) {
			super();
			this.asignable = asignable;
		}
	   
	}
