/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut9;

import java.util.HashMap;





/**
 * @author christianwalter
 *
 * @since 24.11.2020
 */
public class AppTestGernerics {

	public static void main(String[] args) {

		Kunde k1 = new Kunde("Christian", "Walter", "10.09.1995");
		Auto a1 = new Auto();
		Kunde k2 = new Kunde("Christian", "Walter", "10.09.1995");
		Auto a2 = new Auto();
		
		HashMap<Kunde, Auto> hm = new HashMap<Kunde, Auto>();
		
		hm.put(k1, a1);
		hm.put(k2, a2);
		
		System.out.println(hm.toString());
	}
	
	
	
}
