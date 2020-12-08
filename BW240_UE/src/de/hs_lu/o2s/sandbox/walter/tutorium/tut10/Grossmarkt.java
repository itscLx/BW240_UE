/**
 * 
 */
package de.hs_lu.o2s.sandbox.walter.tutorium.tut10;

import java.util.HashMap;
import java.util.Map;

/**
 * @author christianwalter
 *
 * @since 08.12.2020
 */
public class Grossmarkt extends HashMap<String, Supermarkt>{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public Supermarkt put(String key, Supermarkt value) {
		// TODO Auto-generated method stub
		return super.put(key, value);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Supermarkt> m) {
		// TODO Auto-generated method stub
		super.putAll(m);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = "";
		
		for (String entry : this.keySet()) {
		    Supermarkt value = get(entry);
		    
		    string += "Der Supermarkt " + value.getName() + " befindet sich auf dem Stellplatz " + entry + "\n";
		}
		
		return string;
		
	}

	public Grossmarkt deepCopy() {
		Grossmarkt deep = new Grossmarkt();
		
		for (Map.Entry<String, Supermarkt> entry : this.entrySet()) {
		    String key = entry.getKey();
		    Supermarkt value = entry.getValue();
		    
		    deep.put(new String(key), new Supermarkt(value.getKundenanzahl(), value.getVerkaufsflaeche(), value.getName(), value.getOefunungzeiten()));
		    
		}
		
		return deep;
	}
	
	public Grossmarkt shallowCopy() {
		return (Grossmarkt) this.clone();
	}
	
}
