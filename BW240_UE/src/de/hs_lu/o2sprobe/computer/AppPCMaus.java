/**
 * 
 */
package de.hs_lu.o2sprobe.computer;


/**
 * @author christianwalter
 *
 * @since 15.12.2020
 */
public class AppPCMaus {
	
	static AppPCMaus pcmaus = new AppPCMaus();
	
	public static void main(String[] args) {
		pcmaus.erzeugeObjekte();
	}

	public void erzeugeObjekte() {
		Maus maus = this.erzeugeMaus(erzeugePc());
		System.out.println(maus);
	}
	
	
	public PC erzeugePc() {
		return new PC(6000);
	}
	
	public Maus erzeugeMaus(PC pc) {
		return new Maus(pc);
	}
	
}
