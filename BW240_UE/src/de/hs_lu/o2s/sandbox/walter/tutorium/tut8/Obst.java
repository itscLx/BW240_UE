package de.hs_lu.o2s.sandbox.walter.tutorium.tut8;

import static org.junit.Assert.assertNotNull;

public class Obst {
	
	private String haltbarkeit;
	private double preis;
	private String name;
	public String getHaltbarkeit() {
		return haltbarkeit;
	}
	public void setHaltbarkeit(String haltbarkeit) {
		this.haltbarkeit = haltbarkeit;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Obst(String haltbarkeit, double preis, String name) {
		super();
		this.haltbarkeit = haltbarkeit;
		this.preis = preis;
		this.name = name;
	}
	
	public Obst() {
		
	}
	
	
	
	

	

}
