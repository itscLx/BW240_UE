/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut8;

/**
 * @author christianwalter
 *
 * @since 17.11.2020
 */
public class AppGeschäfte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gemuese karotte = new Gemuese("12.12.2020", 1.50, "Karotte");
		Gemuese brokkoli = new Gemuese("12.12.2020", 1.50, "brokkoli");
		Gemüsegeschäft g1 = new Gemüsegeschäft();
		Obst apfel = new Obst("12.12.2020", 2.00, "Apfel");
		Obst traube = new Obst("12.12.2020", 2.00, "traube");
		Obststand o1 = new Obststand();
		
		
		g1.add(karotte);
		g1.add(brokkoli);
		o1.add(traube);
		o1.add(1, apfel);
		
		System.out.println(g1.toString());
		System.out.println(o1.toString());
		
		
		
		
	}

}
