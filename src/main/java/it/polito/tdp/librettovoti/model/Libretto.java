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

}
