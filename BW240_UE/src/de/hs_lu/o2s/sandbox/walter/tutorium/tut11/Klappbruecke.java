package de.hs_lu.o2s.sandbox.walter.tutorium.tut11;

public class Klappbruecke extends Bruecke{
	
	
	private double maxTragkraft;
	private boolean geoeffnet;
	
	public Klappbruecke() {
		
	}
	
	public Klappbruecke(double laenge, int baujahr, int letzteRenovierung) {
		super(laenge, baujahr, letzteRenovierung);
	}
	

	private String stringGeoeffnet(){
		if(this.geoeffnet) {
			return "Die Br�cke ist nicht befahrbar.";
		}else return "Die Br�cke ist befahrbar.";
	}



	public double getMaxTragkraft() {
		return maxTragkraft;
	}



	public void setMaxTragkraft(double maxTragkraft) {
		this.maxTragkraft = maxTragkraft;
	}



	public boolean getGeoeffnet() {
		return geoeffnet;
	}



	public void setGeoeffnet(boolean geoeffnet) {
		this.geoeffnet = geoeffnet;
	}
	
	public String toString() {
		String s = super.toString();
		s += this.stringGeoeffnet() + "\n";
		s += "Die maximale Tragkraft betr�gt " +  this.getMaxTragkraft() + " Tonnen.";
		return s;
	}

	@Override
	public boolean maxLast(double gewicht) {
		// TODO Auto-generated method stub
		if(gewicht > this.maxTragkraft) {
			return false;
		} else {
			return true;
		}
		
		
	}
	
	public int compareTo(Bruecke o) {
		if(super.compareTo(o) == 0) {
			if(maxLast(((Klappbruecke)o).maxTragkraft)) {
				System.out.println("Die jetzige Brücke hat gewonnen");
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}
	
}
