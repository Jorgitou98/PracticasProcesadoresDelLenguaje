package ast;

import java.util.List;

public class InsSwitch extends Ins{
	private E varSwitch;
	private List<CorchetesYPuntosIzq> cyp;
	private List<Case> listaCase;
	public InsSwitch(E varSwitch, List<CorchetesYPuntosIzq> cyp, List<Case> listaCase) {
		super();
		this.listaCase = listaCase;
		this.varSwitch = varSwitch;
		this.cyp = cyp;
	}
	public List<CorchetesYPuntosIzq> getCyp() {
		return cyp;
	}
	public E getVarSwitch() {
		return varSwitch;
	}
	public List<Case> getListaCase() {
		return listaCase;
	}
	@Override
	public TipoIns tipo() {
		return TipoIns.INSSWITCH;
	}
	
	public String toString() {
		String cases = "";
		for (Case c: listaCase) {
			cases = cases + ", " + c.toString();
		}
		String spyc = "";
		for (CorchetesYPuntosIzq c: cyp) {
			spyc = spyc + ", " + c.toString();
		}
		return "InsSwitch(varSwitch: " + varSwitch.toString()+ ", PuntosYCorcehetes: " +spyc+ ", Cases: " + cases + ")";
	}

	@Override
	public String imprime(String prev, boolean barra) {
		String s = prev + "\\__Inst Switch\n";
		String next = prev;
		if (barra) next += "|";
		else next += " ";
		s = s + next + "   \\__Var Switch\n";
		String nextVar = next + "   |";
		for(int i = 0; i < "__Var Switch".length(); ++i) {
			nextVar += " ";
		}
		s += varSwitch.imprime(nextVar, false);
		String nextPyc = nextVar + "    ";
		for (int i = 0; i < cyp.size(); ++i ) {
			if(i == cyp.size()-1) s+= (cyp.get(i)).imprime(nextPyc, false);
			else s+= (cyp.get(i)).imprime(nextPyc, true);
			
		}
		s = s + next + "   \\__Cases\n";
		String nextCases = next;
		for(int i = 0; i < "   \\__Cases".length(); ++i) {
			nextCases += " ";
		}
		for(int i = 0; i < listaCase.size(); ++i) {
			if(i == listaCase.size()-1) s += listaCase.get(i).imprime(nextCases, false);
			else s += listaCase.get(i).imprime(nextCases, true);		
		}
		return s;
	}

	
	
	
	

}
