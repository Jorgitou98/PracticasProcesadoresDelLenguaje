package ast;

public class MenorIgual extends EBin{
	public MenorIgual(E opnd1, E opnd2, boolean asignable) {
	     super(opnd1,opnd2, "(<=)", asignable);  
	   }     
	public TipoE tipo() {return TipoE.MENORIGUAL;}
}
