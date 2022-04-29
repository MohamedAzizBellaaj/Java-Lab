import java.io.*;


public class SaveEtudiant{
public static void main(String[] args) {
Etudiant e = new Etudiant("Bellaaj","Aziz","14");
try{ File f = new File("etudiant.ser");
 FileOutputStream of = new FileOutputStream(f);
 ObjectOutputStream objf = new ObjectOutputStream(of);
 objf.writeObject(e);
 objf.close();
} catch (Exception ex) {}
}
}