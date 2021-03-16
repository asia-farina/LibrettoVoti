package it.polito.tdp.librettovoti.model;

import java.util.Comparator;

public class ComparatorVoti implements Comparator <Voto> {
	@Override
	public int compare(Voto arg0, Voto arg1) {
		// TODO Auto-generated method stub
		if (arg0.getNome().compareTo(arg1.getNome())==0)
		{
			if (arg0.getVoto()==arg1.getVoto())
				return 0;
			if (arg0.getVoto()>arg1.getVoto())
				return -1;
			else return 1;
		}
		return arg0.getNome().compareTo(arg1.getNome());
	}	
}
