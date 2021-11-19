package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
	private String tekst;

	// TODO: objektvariable 
	
	public Tekst () {
		
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst=tekst;
		
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst=tekst;
//		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		return tekst;
//		throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		this.tekst=tekst;
//		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
//		System.out.println("TEKST" +"\n" + super.toString() + tekst + "\n");
		
		return "TEKST" +"\n" + super.toString() + tekst + "\n"; 
		
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
