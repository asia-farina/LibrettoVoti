package it.polito.tdp.librettovoti.model;

import java.time.*;

public class TestLibretto {
	
	public static void main (String[] args) {
	    Libretto libretto=new Libretto();
	    Voto voto1=new Voto ("Analisi I", 30, LocalDate.of(2019, 2, 15));
	    libretto.setVoti(voto1);
	    libretto.setVoti(new Voto ("Fisica I", 28, LocalDate.of(2019,  7, 15)));
	    libretto.setVoti(new Voto ("Informatica", 24, LocalDate.of(2019, 9, 3)));
	    libretto.setVoti(new Voto ("Chimica", 25, LocalDate.of(2019, 2, 20)));
	    System.out.println(libretto);
	    System.out.println(libretto.librettoEsamiVotoUguale(25));
	}
}
