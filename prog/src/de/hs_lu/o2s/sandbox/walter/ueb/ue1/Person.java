package de.hs_lu.o2s.sandbox.walter.ueb.ue1;

public class Person {
	

	/**
	 * Deklaration von Variablen 
	 */
	

	String vorname, nachname, beruf;
	boolean berufstaetig;
	Adresse adresse;
	int geburtsjahr;
	String geburtsjahrString;
	
	
	/**
	 * default Konstruktor 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param vorname Vorname wird übergeben
	 * @param nachname Nachname wird übergeben
	 */
	public Person(String vorname, String nachname) {
		// TODO Auto-generated constructor stub
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	/**
	 * 
	 * @param vorname Vorname wird übergeben
	 * @param nachname Nachname wird übergeben
	 * @param adresse Adress Objekt wird übergeben
	 */
	
	public Person(String vorname, String nachname, Adresse adresse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}

	
	/**
	 * toString mit if-Abfrage ob berufstätig oder nicht. 
	 */
	
	public String toString() {
		
		if(geburtsjahr>1900) {
			geburtsjahrString = "\nGeboren im Jahr " + this.getGeburtsjahr() ;
		} else {
			geburtsjahrString = "";
		}
		
		
		if(berufstaetig) {
			return this.getVorname() + " " + this.getNachname() + "\n" + "Beruf: " + this.getBeruf() + geburtsjahrString + "\nAdresse: \n" + adresse.toString();
		} else {
			return this.getVorname() + " " + this.getNachname()+ "\n" + "Beruf: " + "Person ist nicht berufstätig" + geburtsjahrString + "\nAdresse: \n" + adresse.toString();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	/* 
	 * GETTER UND SETTER
	 */
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getBeruf() {
		return beruf;
	}

	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}

	public boolean isBerufstaetig() {
		return berufstaetig;
	}

	public void setBerufstaetig(boolean berufstaetig) {
		this.berufstaetig = berufstaetig;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getGeburtsjahr() {

		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	
	
	
	
	
}
