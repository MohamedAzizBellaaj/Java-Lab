import java.util.*;

public class CompareByAge implements Comparator<Etudiant> {
    public int compare(Etudiant o1, Etudiant o2) {
        return Integer.compare(o1.age, o2.age);
    }
}