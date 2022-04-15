package gestions_notes;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<etudiant>{
	public boolean add(etudiant e) {
		if(this.indexOf(e)>0) {
			int i=indexOf(e);
			super.set(i, e);
			return false;
		}
		return super.add(e);
	}

}
