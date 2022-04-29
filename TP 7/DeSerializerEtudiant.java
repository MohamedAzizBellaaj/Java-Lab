import java.io.*;


public class DeSerializerEtudiant {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            FileInputStream fichier = new FileInputStream("Etudiants.ser");
            ois = new ObjectInputStream(fichier);
            Etudiants etudiants = (Etudiants) ois.readObject();
            for (Etudiant e : etudiants.list) {
                System.out.println("");
                System.out.println("nom : " + e.nom);
                System.out.println("prenom : " + e.prenom);
                System.out.println("note : " + e.note);
            }
        } catch (Exception e) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception ex) {
            }
        }
    }
}
