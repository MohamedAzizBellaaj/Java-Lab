import java.io.*;
import java.util.Scanner;


public class SaveMultipleEtudiant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Etudiants et = new Etudiants();
		boolean cond = true;
		while (cond) {
			System.out.println("nom = ");
			String nom = sc.nextLine();
			System.out.println("prenom = ");
			String prenom = sc.nextLine();
			System.out.println("note = ");
			String note = sc.nextLine();
			Etudiant e = new Etudiant(nom, prenom, note);
			et.list.add(e);
			System.out.println("type true to continue, false to exit");
			cond = sc.nextBoolean();
			sc.nextLine();
		}
		try {
			File f = new File("Etudiants.ser");
			FileOutputStream of = new FileOutputStream(f);
			ObjectOutputStream objf = new ObjectOutputStream(of);
			objf.writeObject(et);
			objf.close();
		} catch (Exception ex) {
		}
	}
}
