package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;


public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	// TODO - deklarering av objektvariable
	
	public Innlegg() {
//		bruker = null;
//		dato = null;		
//		likes = 0;
//		id = 0;
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		likes = 0;
		this.bruker = bruker;
		this.id = id;
		this.dato = dato;

		// TODO 
//		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.likes = likes;
		this.bruker = bruker;
		this.id = id;
		this.dato = dato;
		// TODO - START
		
//		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		return bruker;
//		throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
//		throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		return dato;
//		throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		this.dato = dato;
//		throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		return id;
//		throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {
		return likes;
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		likes ++;
//		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
//		
		return getId() == innlegg.id;

		
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
//         System.out.println(id  + "\n" + bruker + "\n" + dato + "\n" + likes +"\n");
		
         return id  + "\n" + bruker + "\n" + dato + "\n" + likes +"\n"; // "\n" er linjeskift

				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
