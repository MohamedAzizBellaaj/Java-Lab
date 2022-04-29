import java.util.*;

public class CompareByMoyenne implements Comparator<Etudiant> {
    public int compare(Etudiant o1, Etudiant o2) {
        return Float.compare(o1.moyenne, o2.moyenne);
    }
}