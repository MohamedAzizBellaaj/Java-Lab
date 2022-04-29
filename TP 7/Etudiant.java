import java.io.*;

public class Etudiant implements Serializable{
	public String nom;
	public String prenom;
	public String note;
	public Etudiant(String nom, String prenom, String note){
		this.nom=nom;
		this.prenom=prenom;
		this.note=note;
	}
	
}