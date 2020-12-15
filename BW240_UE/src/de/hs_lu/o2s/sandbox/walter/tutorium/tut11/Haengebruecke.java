package de.hs_lu.o2s.sandbox.walter.tutorium.tut11;

public class Haengebruecke extends Bruecke{
	
	private double maxBelastung;
	
	public Haengebruecke() {
		
	}

	public Haengebruecke(double laenge, int baujahr, int letzteRenovierung) {
		super(laenge, baujahr, letzteRenovierung);
	}
	
	public String toString() {
		String s = super.toString();
		s += "Die maximale Belastung betr�gt " + this.maxBelastung +  " Tonnen.";
		return s;
	}

	@Override
	public boolean maxLast(double gewicht) {
		if(gewicht > maxBelastung) {
			return false;
		} else {
			return true;
		}
	}

	public int compareTo(Haengebruecke o) {
		if(super.compareTo(o) == 0) {
			if(maxLast(((Haengebruecke)o).maxBelastung)) {
				System.out.println("Die jetzige Brücke hat gewonnen");
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}
	
	

}
