import java.util.*;

public class Etudiant implements Comparable<Etudiant> {
    public String nom;
    public String prenom;
    public int numero;
    public int age;
    public float moyenne;

    public Etudiant(String nom, String prenom, int numero, int age, float moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.age = age;
        this.moyenne = moyenne;
    }

    public int compareTo(Etudiant e) {
        return Float.compare(moyenne, e.moyenne);
    }
}