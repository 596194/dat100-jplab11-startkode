package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggtabell;
	private int nesteledig;

	// TODO: objektvariable 

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	
//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
		
//		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteledig;
//		throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
//		throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int pos=0;
		boolean funnet = false;
		
		while (pos<nesteledig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet=true;
			}
			else {
				pos++;
			}
		}
		if(funnet) {
		return pos;
		}
		else {
			return -1;
		}
	
	}

	

	public boolean finnes(Innlegg innlegg) {
		int pos=0;
		boolean funnet = false;
		
		while (pos<nesteledig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet=true;
			}
			else {
				pos++;
			}
		}
		return funnet;
	}
		

	public boolean ledigPlass() {
		return nesteledig<innleggtabell.length;
	}

	
	public boolean leggTil(Innlegg innlegg) {

		boolean lagtTil = false;
		if (!finnes(innlegg)&&ledigPlass()) {
			innleggtabell[nesteledig]=innlegg;
			lagtTil=true;
			nesteledig++;
		}

		return lagtTil;

		}

//		throw new UnsupportedOperationException(TODO.method());
	
	
	public String toString() {

		String print = nesteledig + "\n";
		
		for (int i=0; i<nesteledig;i++) {
			print += innleggtabell[i].toString();
		}
		return print;

		
	}
//		throw new UnsupportedOperationException(TODO.method());
	

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}