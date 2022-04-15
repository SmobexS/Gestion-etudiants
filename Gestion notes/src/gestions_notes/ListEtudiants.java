package gestions_notes;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<etudiant>{

//redifinition se add
	public boolean add(etudiant e) {
		if(this.indexOf(e)>=0) {
			int i=indexOf(e);
			super.set(i, e);
			return false;
		}
		return super.add(e);
	}

// methode filtrer
	public ListEtudiants filtrer(Condition c){
		ListEtudiants l;
		for(etudiant e : ArrayList<etudiant>) {
			if (c.estVrai(e)) {
				l.add(e);
			}
		}
		return l;
	}
}
