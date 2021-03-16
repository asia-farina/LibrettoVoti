package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	private List <Voto> voti;
	
	public Libretto () {
		this.voti=new ArrayList <Voto>();
	}
	
	public boolean setVoti (Voto v) {
		for (Voto vv:this.voti)
		{
			if (vv.getNome().toLowerCase().equals(v.getNome().toLowerCase()) && vv.getVoto()==v.getVoto())
				return false;
		}
		this.voti.add(v);
		ComparatorVoti c=new ComparatorVoti ();
		Collections.sort(voti, c);
		return true;
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
	
	public Voto ricercaCorso (String nomeCorso) {
		for (Voto v:this.voti)
		{
			if (v.getNome().equals(nomeCorso))
				return v;
		}
		return null;
	}

}
