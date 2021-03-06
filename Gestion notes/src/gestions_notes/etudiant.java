package gestions_notes;

public class etudiant implements Comparable<etudiant> {
	private int id;
	private String nom;
	private double note;
	
	public void setNote(double note) {
		this.note = note;
	}
	
	public double getNote() {
		return note;
	}
	
// Creation du constructeur
	etudiant (int i , String na){
		this.id = i;
		this.nom = na;
		this.note = 10;
	}
	
//redefinition de toString
public String toString() {
		return "( "+this.nom+" : "+this.note+" )";
	}

//redefiniton de equals
public boolean equals(etudiant e1) {
	if (this.id==e1.id) {
		return true;
	}
	return false;
}

//implementation de comparable
public int compareTo(etudiant e) {
	
	if(this.note>e.note) return 1;
	if(this.note==e.note) return 0;
	return -1;
}
}
