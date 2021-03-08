package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	private List <Voto> voti;
	
	public Libretto () {
		this.voti=new ArrayList <Voto>();
	}
	
	public void setVoti (Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s="";
		for (Voto v:this.voti)
		{
			s+=v.toString();
		}
		return s;
	}
	
	public List <Voto> listaEsamiVotoUguale (int punteggio) {
		List <Voto> votiUguali=new LinkedList <Voto>();
		for (Voto v:this.voti)
		{
			if (v.getVoto()==punteggio)
			votiUguali.add(v);
		}
		return votiUguali;
	}
	
	public Libretto librettoEsamiVotoUguale (int punteggio) {
		Libretto risultato=new Libretto();
		for (Voto v:this.voti)
		{
			if (v.getVoto()==punteggio)
			   risultato.setVoti(v);
		}
		return risultato;
	}

}
