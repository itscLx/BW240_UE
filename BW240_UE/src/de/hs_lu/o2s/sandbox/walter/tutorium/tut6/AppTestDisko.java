/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut6;

/**
 * @author christianwalter
 *
 * @since 03.11.2020
 */
public class AppTestDisko {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disko d1 = new Disko(11.0);
		Disko d2 = new Disko();
		Haus h1 = new Disko(11.0);
		
		d1.compareTo(d2);
		
		d1.compareTo((Disko)h1);
	}

}
