package de.hs_lu.o2s.sandbox.walter.tutorium.tut7;

public class Segelboot extends Boot {
	
	private int anzSegel;
	private int baujahr;
	
//	Nur Notwendig, wenn sich der Name unterscheidet
//	public void setPassagiere(int passagiere) throws ZuVielePersonenException {
//		this.checkPersonen(passagiere);
//		super.setPassagiere(passagiere);
//	}
	
	public Segelboot(int kajueten, int passagiere){
		super(kajueten);
		this.setPassagiere(passagiere);
	}
	
	
	public int getAnzSegel() {
		return anzSegel;
	}
	public void setAnzSegel(int anzSegel) {
		this.anzSegel = anzSegel;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	
	@Override
	public int compareTo(Object o) {
		if(getKajueten() == ((Boot) o).getKajueten()) {
			if(getLaenge() > ((Boot)o).getLaenge()) {
				return 1;
			}else if (getLaenge() < ((Boot)o).getLaenge()) {
				return -1;
			}else if (getLaenge() == ((Boot)o).getLaenge()) {
				return 0;
			}else {
				return 0;
			}
		}else {
			return 0;
		}
		
	}
	

}
